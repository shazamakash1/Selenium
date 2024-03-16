package com.akash.Main;

import java.io.IOException;

import org.apache.poi.hpsf.Property;

import com.akash.Utility.ReadAllProperty;
import com.akash.Utility.ReadMethod;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello");
		DataStorage.initializeDataStorage();
		ReadAllProperty.ReadProperty();
		
		
		
		String filePath = "../#FILESTORE/InputFiles/TestCase.xlsx";
		
		if(filePath.contains(".xlsx"))
			ReadMethod.readDataXLSX(filePath, 0, "Descision", "Y");
		else if(filePath.contains(".xls"))
			ReadMethod.readDataXLS(filePath, 0, "Descision", "Y");
		 
	}

}
