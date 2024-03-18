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
                    bat 'mvn clean install' // Windows'ta çalışacak bir komut
                }
            }
        }
    }

    // JDK'nın otomatik olarak yüklenmesini sağlayacak olan tool tanımı
    tools {
        // JDK'yı otomatik olarak yüklerken kullanılacak olan 'Java' aracı
        jdk {
            // JDK'nın yükleneceği ve kullanılacağı konumu belirtin
            name = 'Java'
            // JDK'nın indirileceği URL'yi belirtin (opsiyonel)
            // Örneğin: 'https://download.java.net/java/GA/jdk11/9/GPL/openjdk-11.0.2_windows-x64_bin.zip'
            //url = 'https://download.java.net/java/GA/jdk11/9/GPL/openjdk-11.0.2_windows-x64_bin.zip'
        }
    }
}




