#!/bin/bash

mysql -h dm14g4fw7su037s.ceyhvqsgxmc0.ap-northeast-1.rds.amazonaws.com \
    -utanyixiu \
    -ptanyixiu \
    --port=3306 \
    < drupal_db.sql