package util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class GetProperties {
    private static GetProperties getProperties= null;
    private String browser;
    private String host;

    private GetProperties(){
        Properties properties = new Properties();
        String nameFile="phpTravels.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
        if(inputStream!= null){
            try {
                properties.load(inputStream);
                browser=properties.getProperty("browser");
                host=properties.getProperty("host");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static GetProperties getInstance(){
        if (getProperties == null)
            getProperties=new GetProperties();
        return getProperties;
    }

    public String getBrowser() {
        return browser;
    }

    public String getHost() {
        return host;
    }
}
