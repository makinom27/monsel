package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by akinom on 08/06/2016.
 */
public class ConfigReader {

    static Properties prop;


    public ConfigReader() throws FileNotFoundException {

        File src = new File("/Users/akinom/IdeaProjects/Sele/src/main/Configuration/config.property");
        FileInputStream fs = new FileInputStream(src);
        prop = new Properties();
        try {
            prop.load(fs);
        } catch (IOException e) {
            System.out.println("Exception is: " +e.getMessage());
        }


    }

    public String getName(){

        String name = prop.getProperty("name");
        return name;
    }


}
