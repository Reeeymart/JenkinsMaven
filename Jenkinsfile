pipeline {
    agent any 
    stages {
        stage('Cleaning Stage') { 
            steps {
                bat "mvn clean"
            }
        }
        stage('Testing Stage') { 
            steps {
                bat "mvn test"
            }
        }
        stage('Packaging Stage') { 
            steps {
                bat "mvn package"
            }
        }
        stage('Consolodate Results') {
            steps {
                input("Do you want to capture results ?")
                junit '**/target/surefire-reports/TEST-*.xml'
                archive 'target/*.jar'
            }
        }
        stage("Email Build Status") {
           steps {
                mail body:"${env.JOB_NAME} -Build#${env.BUILD_NUMBER} -${currentBuild.currentResult}\n\nCheck console output at ${env.BUILD_URL} to view results.",subject:"${env.JOB_NAME} -Build#${env.BUILD_NUMBER} -${currentBuild.currentResult}!!", to:'reymartang555@gmail.com'
           }
        }
    }
}
