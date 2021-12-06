package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelpath,String sheetName) {
		try {
			workbook= new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {

			e.printStackTrace();
		}

		//"./excel/data.xlsx"
	}
	
	
	public static void main(String[] args) {
		//getRowCount();
		//getCellDataString();
		//getCellDataNumeric();
	}

	public static void getRowCount() {
		
		try {
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println(rowCount);
		    //main(null);
			} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void getCellDataString(int rowNum,int colNum) {
	
		try {
			String ndRow =sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(ndRow);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public static void getCellDataNumeric(int rowNum,int colNum) {
		
		try {
			double numberValue =sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(numberValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}