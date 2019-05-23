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

        stage ('Test Stage') {
            steps {
                withMaven (maven : 'maven_3.6.1') {
                    sh 'mvn clean test'
                }
            }
        }

        stage ('Package Stage') {
            steps {
                withMaven (maven : 'maven_3.6.1') {
                    sh 'mvn clean package'
                }
            }
        }
    }
}