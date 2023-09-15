package org.practice.javaDaily;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertieLoader {
	public static Properties loadProperties(String resourceFileName)throws IOException {
		Properties config=new Properties();
		InputStream inputStream=PropertieLoader.class.getClassLoader().getResourceAsStream(resourceFileName);
		config.load(inputStream);
		inputStream.close();
		return config;
	}

}
