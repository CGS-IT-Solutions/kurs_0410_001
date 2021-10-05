pipeline {
    agent any

    tools {
        maven 'maven_3.6.3'
        jdk 'jdk_1.8.0'
    }

    stages {
        stage('Introduction and Pre Checks') {
            steps {
                echo 'This is a minimal pipeline.'
                script {
                    sh 'df -h'
                    sh 'java -version'
                }
            }
        }
        stage('Build Project') {
            steps{
                echo 'build'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Build and Unit Test') {
            steps{
                echo 'test'
                sh "mvn -B -nsu clean install"
            }
            post {
                            always {
                                junit "**/surefire-reports/*.xml"
                            }
                        }
        }
        stage('ECHO') {
            steps{
                echo 'ECHOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO'
            }
        }
/*
        stage('Build Downstream Jobs') {
            when {
                expression { build_downstream == true }
            }
            steps {
                echo "build downstream jobs"
                build job: "kurs_0410_002", wait: true
            }
        }
 */
    }
    post {
        failure {
            echo "Build POST  FAILURE action "
        }
        always {
            echo "Build POST action"
        }
    }
}