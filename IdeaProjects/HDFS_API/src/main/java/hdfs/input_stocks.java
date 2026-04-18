package hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

public class input_stocks {
    public static void main(String[] args) throws IOException {
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(conf);

        System.out.println("Created counties directory in HDFS");
        String defaultFS = conf.get("fs.defaultFS");
        System.out.println("Default FS from conf: " + defaultFS);



        }

    }
}
