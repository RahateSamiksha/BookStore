package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {
	public static String readPropertiesFile(String value) throws IOException {
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\samir\\git\\BookStore\\src\\main\\resources\\config.properties");
		prop.load(file);
		return prop.getProperty(value);
	}
}
