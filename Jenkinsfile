pipeline {
    agent any

    stages {
        stage {
            stage ('Compile Stage') {
                steps {
                    withMaven (maven : 'maven_3.6.1') {
                        sh 'mvn clean compile'
                    }
                }
            }
        }

        stage {
            stage ('Test Stage') {
                steps {
                    withMaven (maven : 'maven_3.6.1') {
                        sh 'mvn clean test'
                    }
                }
            }
        }

        stage {
            stage ('Package Stage') {
                steps {
                    withMaven (maven : 'maven_3.6.1') {
                        sh 'mvn clean package'
                    }
                }
            }
        }
    }
}