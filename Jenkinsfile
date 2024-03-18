pipeline {
    agent any

    environment {
        // Çift tırnak içinde PATH değişkeni
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
                    bat '"C:\\Program Files\\Java\\openjdk-21.0.2\\bin\\java"'
                }
            }
        }
    }

    // JDK'nın otomatik olarak yüklenmesini sağlayacak olan tool tanımı
    tools {
        // JDK'yı otomatik olarak yüklerken kullanılacak olan 'Java' aracı
        jdk 'Java'
    }
}
