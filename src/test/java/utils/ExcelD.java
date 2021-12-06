package utils;

public class ExcelD {

	public static void main(String[] args) {
		
	ExcelUtils eu = new ExcelUtils("./excel/data.xlsx","Sheet1");
	
	eu.getCellDataString(1, 0);
	eu.getCellDataNumeric(2,1);
	

	}

}
