pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }

    stages {
        stage ('First Stage') {
            steps {
                echo 'echo First Stage'
            }
        }

        stage ('Test Stage') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}