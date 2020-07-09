pipeline {
    agent any
    stages {
        stage('Build Backend') {
            steps {
                sh 'mvn clean package -DskipTests=true' // clean and build without make tests
            }
        }

        // stage Deploy Backend removed

        // API Test

        stage('Deploy Frontend') {
            steps {
                // Create a new dir
                dir('frontend') {
                    git credentialsId: 'github_login', url: 'https://github.com/dantovsky/tasks-frontend' // download files
                    sh 'npm install' // install packages and dependencies
                    sh 'npm run serve' // deploy
                }
            }
        }
    }
}