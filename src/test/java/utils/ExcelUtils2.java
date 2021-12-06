package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils2{

	
	public static void main(String[] args) {
		
	getRowCount();
	getColCount();
	getStringCellData();
	getNumericCellData();
	
	
	
	}
	
	public static void getRowCount() {
		XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook("./excel/data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int rowCount =sheet.getPhysicalNumberOfRows();
			System.out.println(rowCount);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
	public static void getColCount() {
		XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook("./excel/data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int colCount =sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println(colCount);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
	public static void getStringCellData() {
		XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook("./excel/data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			String cellValue=sheet.getRow(2).getCell(0).getStringCellValue();
			System.out.println(cellValue);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	

	public static void getNumericCellData() {
		XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook("./excel/data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			double cellNumericValue=sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println(cellNumericValue);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
	
}

