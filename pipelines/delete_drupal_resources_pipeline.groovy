node {

    stage('Download Delete Scripts') {
        sh '''
        rm -rf automation_deployment
        git clone https://github.com/tanyixiu/automation_deployment.git
     '''
    }

    stage('Delete Drupal Resources') {
        sh'''
        export PATH=$PATH:/usr/local/bin
        cd automation_deployment
        ./start_delete_drupal_resources.sh
       '''
    }
}

