pipeline {
    agent any
    tools {
        maven 'maven3.6.1'
        jdk 'jdk8'
    }

    stages {
        stage ('First Stage') {
            steps {
                echo 'First Stage'
            }
        }

        stage ('Test Stage') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}