pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            withMaven (maven : 'maven_3.6.1') {
                sh 'mvn clean compile'
            }
        }
    }

    stages {
        stage ('Test Stage') {
            withMaven (maven : 'maven_3.6.1') {
                sh 'mvn test'
            }
        }
    }

    stages {
        stage ('Package Stage') {
            withMaven (maven : 'maven_3.6.1') {
                sh 'mvn clean package'
            }
        }
    }
}