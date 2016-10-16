node {

    stage('Download Provision Scripts') {
        sh '''
        rm -rf automation_deployment
        git clone https://github.com/tanyixiu/automation_deployment.git
     '''
    }

    stage('Privision Drupal Resources') {
        sh'''
        export PATH=$PATH:/usr/local/bin
        cd automation_deployment
        ./start_provision_drupal_resources.sh
       '''
    }
}