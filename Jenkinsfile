pipeline {
    agent any
    stages {
        stage('Build Backend') {
            steps {
                sh 'mvn clean package -DskipTests=true' // clean and build without make tests
            }
        }

        // stage Deploy Backend removed

        stage('API Test') {
            steps {
                // Create a new dir inside DeployBack Project
                dir('api-test') {
                    // It's needed download the API Test Project
                    git credentialsId: 'github_login', url: 'https://github.com/dantovsky/lab-api-test'
                    sh 'mvn test'
                }
            }
        }
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