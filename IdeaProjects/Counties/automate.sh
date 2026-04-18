mvn clean

mvn package

cp target/Counties-1.0-SNAPSHOT.jar /home/talentum/hdp/pigandhive/labs/lab2.1/HDFS_API/

cd /home/talentum/hdp/pigandhive/labs/lab2.1/HDFS_API/

yarn jar Counties-1.0-SNAPSHOT.jar hdfs.InputCounties

hdfs dfs -ls
