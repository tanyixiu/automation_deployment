#!/bin/bash

WORKING_DIRECTORY=`pwd`

ansible-playbook ./ansible/create_drupal_resources.yml --extra-vars="

  env='$ENV'
  aws_access_key='$AWS_ACCESS_KEY'
  aws_secret_key='$AWS_SECRET_KEY'
  working_directory='$WORKING_DIRECTORY'

  "

