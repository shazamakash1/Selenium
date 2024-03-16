package com.akash.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadAllProperty {

	public static void ReadProperty() {
		Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("../#FILESTORE/Properties/config.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("URL->"+ properties.getProperty("$URL"));
        
	}
	
	
	
}
