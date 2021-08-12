package com.mt.exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadOperation {

	public static void main(String[] args) throws IOException {
	
		String excelFilePath=".\\datafiles\\employee.xlsx";
		FileInputStream fis=new FileInputStream(excelFilePath);
		XSSFWorkbook workBook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workBook.getSheetAt(0);
		
		//read data using normal for loop
		
//		int rows=sheet.getLastRowNum();
//		int cols=sheet.getRow(1).getLastCellNum();
//		
//		for(int i=0;i<=rows;i++)
//		{
//			XSSFRow row=sheet.getRow(i);
//			for(int j=0;j<cols;j++)
//			{
//				XSSFCell cell=row.getCell(j);
//				
//				switch(cell.getCellType())
//				{
//				case STRING:System.out.print(cell.getStringCellValue());break;
//				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
//				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
//				default:System.out.println("out of the syllabus");
//				}
//				System.out.print("  ");
//			}
//			System.out.println();
//		}
		
		//read data using Iterator
		
		Iterator rowItr=sheet.iterator();
		while(rowItr.hasNext())
		{
			XSSFRow row=(XSSFRow)rowItr.next();
			Iterator cellItr=row.cellIterator();
			while(cellItr.hasNext())
			{
				XSSFCell cell=(XSSFCell)cellItr.next();
				
				switch(cell.getCellType())
				{
				case STRING:System.out.print(cell.getStringCellValue());break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
				default:System.out.print("invalid type of data");
				}
				System.out.print("  ");
			}
			System.out.println();
		}

	}

}
