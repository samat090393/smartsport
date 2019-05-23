pipeline {
    agent any
    tools {
        maven 'maven 3.6.1'
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
                bash 'mvn clean test'
            }
        }
    }
}