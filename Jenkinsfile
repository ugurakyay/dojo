
pipeline {
    agent any

    environment {
        // JDK'yı PATH ortam değişkenine eklemek için
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
                    // Doğru komutu kullanarak Java'yı çağırın
                    bat "\"${tool 'Java'}/bin/java\" -jar C:\\Program Files\\Java\\openjdk-21.0.2\\bin\\java.exe"
                }
            }
        }
    }

    // JDK'nın otomatik olarak yüklenmesini sağlayacak olan araç tanımı
    tools {
        // JDK'yı otomatik olarak yüklerken kullanılacak olan 'Java' aracı
        jdk 'Java'
    }
}
