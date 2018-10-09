package com.citi.automation.framework.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public static Object[][] data(String file, String sheet) throws FileNotFoundException, IOException{
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("src/test/resources/"+file+".xlsx"));
		XSSFSheet sh = wb.getSheet(sheet);
		int row_count = sh.getPhysicalNumberOfRows();
		int col_count = sh.getRow(0).getPhysicalNumberOfCells();
		Object[][] x = new Object[row_count-1][col_count];
		for(int i=1;i<row_count;i++)
		{
			for(int j=0;j<col_count;j++)
			{
				x[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return x;
	}
}
