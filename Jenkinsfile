pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {
                withMaven (maven : 'maven_3.6.1') {
                    sh 'mvn clean compile'
                }
            }
        }
    }

    stages {
        stage ('Test Stage') {
            steps {
                withMaven (maven : 'maven_3.6.1') {
                    sh 'mvn clean test'
                }
            }
        }
    }

    stages {
        stage ('Package Stage') {
            steps {
                withMaven (maven : 'maven_3.6.1') {
                    sh 'mvn clean package'
                }
            }
        }
    }
}