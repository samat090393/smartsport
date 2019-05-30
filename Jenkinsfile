pipeline {

    environment {
        registry = "samatlabibulla/smartsport"
        registryCredentials = "dockerhub-creds"
    }

    agent any
    tools {
        maven 'maven3.6.1'
        jdk 'jdk8'
    }

    stages {
        stage ('Test Stage') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage ('Display Docker Images') {
            steps {
                script {
                    docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }
    }
}