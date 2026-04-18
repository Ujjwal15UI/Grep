package hdfs;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class InputStocks {


    public static void main(String[] args) throws IOException{
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(conf);

        System.out.println("Created stocks directory in HDFS");

        String filename = "stocks.csv";
        Path localSrc = new Path(filename);
        Path dest = new Path(filename);
        fs.copyFromLocalFile(localSrc, dest);

        // Print fs.defaultFS from configuration
        System.out.println("fs.defaultFS (from conf): " + conf.get("fs.defaultFS"));

        // Print fs.defaultFS via FileSystem object
        System.out.println("fs.defaultFS (via FileSystem): " + fs.getUri());

    }

}