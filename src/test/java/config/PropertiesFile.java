package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String getProperties() {
		
		Properties prop = new Properties();
		try {
			InputStream input = new FileInputStream("C:\\Users\\pmpin\\eclipse-workspace\\Instacart_Automation\\src\\test\\java\\config\\config.properties");
			prop.load(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browserName=prop.getProperty("browser");
		return browserName;
		
	}
}
