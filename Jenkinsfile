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

        stage('Checkout TestNG Code') {
            steps {
                // TestNG.xml dosyasını çekmek için yeni bir checkout komutu ekleyin
                git branch: 'master', url: 'https://github.com/ugurakyay/dojo.git'
            }
        }

        stage('Install TestNG') {
            steps {
                // TestNG'nin yüklü olup olmadığını kontrol etme
                script {
                    def testngInstalled = bat(script: 'where testng', returnStatus: true)
                    if (testngInstalled != 0) {
                        // TestNG yüklü değilse, TestNG'nin jar dosyasını indirip belirli bir dizine kopyalayın
                        // Bu adımı kendi gereksinimlerinize göre düzenleyin
                        bat 'echo TestNG is not installed. Downloading...'
                        // TestNG jar dosyasını indirme ve belirli bir dizine kopyalama adımları buraya gelecek
                    } else {
                        bat 'echo TestNG is already installed.'
                    }
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    // Doğru komutu kullanarak Java'yı başlatın
                    bat "\"${tool 'Java'}\\bin\\java.exe\" -cp path\\to\\your\\testng.jar org.testng.TestNG TestNG.xml"
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
