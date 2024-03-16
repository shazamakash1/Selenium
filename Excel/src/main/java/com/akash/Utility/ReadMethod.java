package com.akash.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.akash.Main.DataStorage;

public class ReadMethod {
	
	public static void readDataXLSX(String filePath,int sheetIndex, String ColumnName, String HeaderRead) {
		try {
			// Create a FileInputStream to read the XLSX file
	        FileInputStream inputStream = new FileInputStream(new File(filePath));

	        // Create a Workbook object using XSSFWorkbook for XLSX files
	        Workbook workbook = new XSSFWorkbook(inputStream);
	        
	        processData(workbook , sheetIndex , ColumnName , HeaderRead);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void readDataXLS(String filePath,int sheetIndex, String ColumnName, String HeaderRead) {
		try {
            // Read the Excel file
            FileInputStream inputStream = new FileInputStream(new File(filePath));
            Workbook workbook = WorkbookFactory.create(inputStream);
            
            processData(workbook , sheetIndex , ColumnName , HeaderRead);
            
           
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
        }
	}
	
	public static void processData(Workbook workbook ,int sheetIndex, String ColumnName, String HeaderRead) {
		 // Get the first sheet
        Sheet sheet = workbook.getSheetAt(sheetIndex);

        // Find the column index
        int yesColumnIndex = findCol(sheet, ColumnName);

        // Loop through rows and check for "Yes" in the specified column
        int rowsWithYes = 0;
        for (Row row : sheet) {
            Cell cell = row.getCell(yesColumnIndex);
            if (cell != null && cell.getStringCellValue().equalsIgnoreCase(HeaderRead)) {
                // Get and print the entire row
                System.out.println("Found "+HeaderRead+" in column '" + ColumnName + "' on row " + (row.getRowNum() + 1) + ":");
                for (Cell cellInRow : row) {
                    System.out.print(cellInRow.getStringCellValue() + " ");
                	
                }
                System.out.println();
                rowsWithYes++;
            }
        }

        if (rowsWithYes == 0) {
            System.out.println("No rows containing 'Yes' found in column '" + ColumnName + "'.");
        } else {
            System.out.println("Found 'Yes' in " + rowsWithYes + " rows.");
        }
//		return HeaderRead;
	}
	
	private static int findCol(Sheet sheet, String columnName) {
        for (int i = 0; i < sheet.getRow(0).getLastCellNum(); i++) {
            if (sheet.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase(columnName)) {
                return i;
            }
        }
        return -1; // Column not found
    }
	
}
