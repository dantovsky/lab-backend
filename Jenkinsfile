pipeline {
    agent any
    stages {
        stage('Build Backend') {
            steps {
                sh 'mvn clean package -DskipTests=true' // clean and build without make tests
            }
        }
        stage('Build & Deploy Backend') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'SUCCESS') {
                    sh 'docker stop backend-lab'
                    sh 'docker rm backend-lab'
                    sh 'docker rmi backend-lab'
                }
                sh 'docker build -t backend-lab .' // ./mvnw spring:boot start ||| java -jar target/lab-backend.war
                sh 'docker run -d --rm --name backend-lab-container -p 8080:8080 backend-lab'
            }
        }
        stage('API Test') {
            steps {
                // Create a new dir inside lab-backend project
                dir('api-test') {
                    git credentialsId: 'github_login', url: 'https://github.com/dantovsky/lab-api-test'
                    sh 'mvn test'
                }
            }
        }
        stage('Download Frontend') {
            steps {
                // Create a new dir
                dir('frontend') {
                    git credentialsId: 'github_login', url: 'https://github.com/dantovsky/lab-frontend' // download files
                    sh 'ls'
                }
            }
        }
        stage('Build & Deploy Frontend') {
            steps {
                // Create a new dir
                dir('frontend') {
                    sh 'ls'
                    catchError(buildResult: 'SUCCESS', stageResult: 'SUCCESS') {
                        sh 'docker stop frontend-lab-container'
                        sh 'docker rm frontend-lab-container'
                        sh 'docker rmi frontend-lab'
                    }
                    sh 'docker build -t frontend-lab . && docker run -d -it -p 8081:8080 --rm --name frontend-lab-container frontend-lab'
                }
            }
        }
    }
}