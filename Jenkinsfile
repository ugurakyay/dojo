

pipeline {
    agent any

    environment {
        PATH = "${tool 'JDK'}/bin:${env.PATH}"
    }

    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                script {
                    // Diğer build adımları buraya eklenebilir
                    tool 'maven'
                    bat 'mvn clean install'
                }
            }
        }
    }

    // JDK'nın otomatik olarak yüklenmesini sağlayacak olan tool tanımı
    tools {
        jdk 'JDK'
    }
}

