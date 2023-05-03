package fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WritrReadPropertiesFile {

	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("C:\\Users\\Vaishali K\\eclipse-workspace\\CoreJava-C-Programs\\src\\fileHandling\\test.properties");
		Properties p = new Properties();
		p.setProperty("url", "www.facebook.com");
		p.setProperty("user", "john");
		
		p.store(fw, "my first properties file..");
		System.out.println("file created.....");
		fw.close();
		
		FileReader fr = new FileReader("C:\\Users\\Vaishali K\\eclipse-workspace\\CoreJava-C-Programs\\src\\fileHandling\\test.properties");
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("user"));
		fr.close();
		
		
	}

}
