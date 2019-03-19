node {
    stage('Run tests') {
        checkout scm
        sh script: './mvnw clean test', returnStatus: true
        junit 'target/surefire-reports/*.xml'
    }
}