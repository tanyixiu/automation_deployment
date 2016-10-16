node {

    stage('Download Deploy Scripts') {
        sh '''
        rm -rf automation_deployment
        git clone https://github.com/tanyixiu/automation_deployment.git
     '''
    }

    stage('Deploy Drupal Application') {
        sh'''
        export PATH=$PATH:/usr/local/bin
        cd automation_deployment
        ./start_deploy_drupal_application.sh
       '''
    }
}