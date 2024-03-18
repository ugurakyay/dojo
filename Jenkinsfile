pipeline {
    agent any

    environment {
        // PATH değişkeni
        PATH = "${tool 'Java'}/bin;" + "${env.PATH}"
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
                    bat 'mvn clean install' // Windows'ta çalışacak komut
                }
            }
        }
    }

    // JDK'nın otomatik olarak yüklenmesini sağlayacak olan tool tanımı
    tools {
        // 'Java' aracı JDK'yı otomatik olarak yükler
        jdk 'Java'
    }
}






