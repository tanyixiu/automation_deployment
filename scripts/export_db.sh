#!/bin/bash

mysqldump -h dm14g4fw7su037s.ceyhvqsgxmc0.ap-northeast-1.rds.amazonaws.com \
    -utanyixiu \
    -ptanyixiu \
    --port=3306 \
    --single-transaction \
    --routines \
    --triggers \
    --databases  drupal_db > drupal_db.sql