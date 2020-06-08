#!/bin/sh
export JAVA_HOME=/opt/jdk1.8.0_241

cp /$1 $2/
java -jar $2/$1 default > deserialize.log