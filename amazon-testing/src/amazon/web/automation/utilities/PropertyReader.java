package amazon.web.automation.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static String readConfigProperty(String key) throws IOException {
		Properties prop = new Properties();
		File f = new File("./ConfigFiles/Config.properties");
		FileReader fr = new FileReader(f);
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String readElementLocator(String key) throws IOException {
		Properties prop = new Properties();
		File f = new File("./ConfigFiles/Locators.properties");
		FileReader fr = new FileReader(f);
		prop.load(fr);
		return prop.get(key).toString();
	}

}
