package com.mt.exceloperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOperation {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet = workBook.createSheet("emp info");

		//Object[][] empdata = { { "EmpId", "Name", "Job" }, { 1, "smith", "javadev" }, { 2, "jones", "testing" }, {3,"jackie","aiarchitect"} };
		
		ArrayList<Object[]> empdata=new ArrayList<Object[]>();
		empdata.add(new Object[] {"EmpId","Name","Job"});
		empdata.add(new Object[] {1,"prasad","javatrainee"});
		empdata.add(new Object[] {2,"madhu","testengr"});
		empdata.add(new Object[] {3,"jackie","aiarchitect"});
		
		
		//Using simple for loop
//		int rows=empdata.length;
//		int cols=empdata[0].length;
//		
//		System.out.println(rows);
//		System.out.println(cols);
//		for(int i=0;i<rows;i++)
//		{
//			XSSFRow row=sheet.createRow(i);
//			for(int j=0;j<cols;j++)
//			{
//				XSSFCell cell=row.createCell(j);
//				Object value=empdata[i][j];
//				if(value instanceof String)
//				{
//					cell.setCellValue((String)value);
//				}
//				if(value instanceof Integer)
//				{
//					cell.setCellValue((Integer)value);
//				}
//				if(value instanceof Boolean)
//				{
//					cell.setCellValue((Boolean)value);
//				}
//			}
//		}
		
		//using enhanced for loop
		
		int rowCount=0;
		for(Object emp[]:empdata)
		{
			XSSFRow row=sheet.createRow(rowCount++);
			int colCount=0;
			for(Object value:emp)
			{
				XSSFCell cell=row.createCell(colCount++);
				
				if(value instanceof String)
				{
					cell.setCellValue((String)value);
				}
				if(value instanceof Integer)
				{
					cell.setCellValue((Integer) value);
				}
				if (value instanceof Boolean) 
				{
					cell.setCellValue((Boolean) value);
				}
			}
		}
		String filePath=".\\datafiles\\employee.xlsx";
		FileOutputStream fos=new FileOutputStream(filePath);
		workBook.write(fos);
		fos.close();
		System.out.println("employee.xlsx filewritten successfully");
		
	}
}
