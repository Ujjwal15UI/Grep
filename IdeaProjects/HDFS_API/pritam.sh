#author :          Pritam
#Cretation date :  16-04-26
#Task:             To automate the maven
#usage  :          bash pritam.sh


/usr/bin/mvn clean
/usr/bin/mvn package
cp  target/HDFS_API-1.0-SNAPSHOT.jar ~/hdp/pigandhive/labs/lab2.1/
cd ~/hdp/pigandhive/labs/lab2.1/
yarn jar HDFS_API-1.0-SNAPSHOT.jar hdfs.InputCounties
hdfs dfs -ls
