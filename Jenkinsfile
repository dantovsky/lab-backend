pipeline {
    agent any
    stages {
        stage('Build Backend') {
            steps {
                sh 'mvn clean package -DskipTests=true' // clean and build without make tests
            }
        }

        stage('Deploy Backend') {
            steps {
                sh 'docker stop backend111'
                sh 'docker rm backend111'
                sh 'docker rmi backend111'
                sh 'docker build -t backend111 .' // ./mvnw spring:boot start ||| java -jar target/lab-backend.war
                sh 'docker run -d --name backend111 -p 8080:8080 backend111'
            }
        }

        // API Test

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
                    catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                        sh 'docker stop frontend-lab-container'
                        sh 'docker rm frontend-lab-container'
                        sh 'docker rmi frontend-lab'
                    }
                    sh 'docker build -t frontend-lab . && docker run -d -it -p 8081:8080 --rm --name frontend-lab-container frontend-lab'
                    // sh 'npm install && npm run serve' // install packages and dependencies
                }
            }
        }
    }
}