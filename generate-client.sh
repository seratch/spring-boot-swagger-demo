#!/bin/bash
brew install swagger-codegen
output_dir=`dirname $0`/client
rm -rf $output_dir/src
swagger-codegen generate \
  -i http://localhost:8080/v2/api-docs \
  -c swagger-codegen-config.json \
  -l java \
  -o $output_dir
cd $output_dir
mvn install
