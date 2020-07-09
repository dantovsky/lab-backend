pipeline {
    agent any
    triggers {
        pollSCM('* * * * *')
    }
    stages {
        stage('Build Backend') {
            steps {
                sh 'mvn clean package -DskipTests=true' // clean and build without make tests
            }
        }

        // stage Deploy Backend removed

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