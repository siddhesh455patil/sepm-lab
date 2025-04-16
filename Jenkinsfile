pipeline {
    agent any

    tools {
    maven 'Maven'
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
