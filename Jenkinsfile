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
                sh 'docker build -t backend .' // ./mvnw spring:boot start ||| java -jar target/lab-backend.war
                sh 'docker run -d --name backend -p 8083:8080 backend'
            }
        }

        // API Test

        stage('Download Frontend') {
            steps {
                // Create a new dir
                dir('frontend') {
                    git credentialsId: 'github_login', url: 'https://github.com/dantovsky/lab-frontend' // download files
                    sh 'ls'
                    sh 'npm install' // install packages and dependencies
                }
            }
        }
        stage('Run Frontend') {
            steps {
                // Create a new dir
                dir('frontend') {
                    sh 'ls'
                    sh 'npm run serve' // deploy
                }
            }
        }
    }
}