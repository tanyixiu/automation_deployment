node {

    stage('Download Creation Scripts') {
        sh '''
        rm -rf aws-practice
        git clone https://github.com/tanyixiu/automation_deployment.git
     '''
    }

    stage('Create Drupal Stack') {
        sh'''
        export PATH=$PATH:/usr/local/bin
        cd automation_deployment
        ./start_create_drupal_resources.sh
       '''
    }
}
