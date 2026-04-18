/usr/bin/mvn clean
/usr/bin/mvn package
cp target/Stocks-1.0-SNAPSHOT.jar /home/talentum/hdp/pigandhive/labs/lab2.1/HDFS_API/
cd /home/talentum/hdp/pigandhive/labs/lab2.1/HDFS_API/
yarn jar  Stocks-1.0-SNAPSHOT.jar hdfs.InputStocks
