#!/bin/sh
export JAVA_HOME=/opt/jdk1.8.0_241

cp /$1 $2/
java -Dfile.encoding=utf-8 -jar $2/$1 default > deserialize.log