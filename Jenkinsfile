pipeline {
    agent any

    environment {
        // JDK'yı PATH ortam değişkenine ekleyin
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
                script {
                    // TestNG'nin bulunduğu dizin ve dosya adını belirtin
                    def testngJarPath = "${WORKSPACE}/path/to/testng.jar"
                    // Jar dosyasının varlığını kontrol edin
                    if (fileExists(testngJarPath)) {
                        echo 'TestNG jar file found.'
                    } else {
                        error 'TestNG jar file not found. Make sure the jar file is placed in the correct location.'
                    }
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    // Doğru komutu kullanarak Java'yı başlatın
                    bat "\"${tool 'Java'}\\bin\\java.exe\" -cp ${WORKSPACE}\\path\\to\\testng.jar org.testng.TestNG TestNG.xml"
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
