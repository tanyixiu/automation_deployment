#!/bin/bash

ansible-playbook ./ansible/deploy_drupal_application.yml --extra-vars="
  env='$ENV'
  aws_access_key='$AWS_ACCESS_KEY'
  aws_secret_key='$AWS_SECRET_KEY'
  " -vvvv
