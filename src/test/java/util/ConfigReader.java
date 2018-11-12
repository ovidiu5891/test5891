package util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public ConfigReader() {

		try {

			File source = new File("Config\\config.properties");
			FileInputStream fis = new FileInputStream(source);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	

	public String getKey(String key) {
		String configKey = prop.getProperty(key);
		return configKey;
	}

}
