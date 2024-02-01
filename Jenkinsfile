 pipeline {
    agent any

    stages {
        

        stage('Build') {
            steps {
                // Use Maven to build the Spring Boot application
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run tests if applicable
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Deploy the Spring Boot application (e.g., to a server)
                echo 'Deployment steps go here...'
            }
        }
    }

    post {
        success {
            echo 'Build successful! Sending notifications...'
            // Add your success notification steps here
        }

        failure {
            echo 'Build failed! Sending notifications...'
            // Add your failure notification steps here
        }
    }
}
