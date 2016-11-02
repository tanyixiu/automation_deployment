#!/bin/bash

#52.192.223.238

mysqldump -h dm1dhugfpkfnwvd.ceyhvqsgxmc0.ap-northeast-1.rds.amazonaws.com \
    -utanyixiu \
    -ptanyixiu \
    --port=3306 \
    --single-transaction \
    --routines \
    --triggers \
    --databases  drupal_db > drupal_db.sql