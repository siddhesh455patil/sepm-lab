pipeline {
    agent any

    tools {
        maven 'Maven-3.9.9' // this must match your Jenkins Maven tool name
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                echo 'Deploying WAR to Tomcat...'
                // The actual deployment is handled by the Jenkins Deploy plugin
            }
        }
    }
}
