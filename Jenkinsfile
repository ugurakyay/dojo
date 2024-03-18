

pipeline {
    agent any

    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Maven aracının adını buraya ekleyin (Jenkins'de yapılandırılan ad)
                tool 'maven'
                bat 'mvn clean install'
            }
        }
    }
}

