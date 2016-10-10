node {

    stage('Download Deploy Scripts') {
        sh '''
        rm -rf aws-practice
        git clone https://github.com/tanyixiu/automation_deployment.git
     '''
    }

    stage('Deploy Drupal') {
        sh'''
        export PATH=$PATH:/usr/local/bin
        cd automation_deployment
        ./start_deploy_drupal.sh
       '''
    }
}
