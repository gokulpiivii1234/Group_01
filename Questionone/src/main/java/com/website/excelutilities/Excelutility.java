package com.website.excelutilities;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excelutility {
	
	
		
		private static      XSSFWorkbook excelWBook; 
	    private static      XSSFSheet    excelWSheet; 
	   

	    

	    public static String getCellData(int RowNum, int ColNum) throws IOException {
	        
	        
	    	 FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
	                 + "/testData.xlsx");
	    	 excelWBook = new XSSFWorkbook(ExcelFile);
	         excelWSheet = excelWBook.getSheetAt(0);
	         return excelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
	     
	    }
}
	        		
   		
	     		
	     		/*private static      XSSFWorkbook excelWBook1; 
	     	    private static      XSSFSheet    excelWSheet1; 
	     	   	    
	    
	    

		    

		    public static  CharSequence[] getCellData1(int RowNum2, int ColNum2) throws IOException {
		        
		        
		    	 FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
		                 + "/testData.xlsx");
		    	 excelWBook1 = new XSSFWorkbook(ExcelFile);
		         excelWSheet1 = excelWBook1.getSheetAt(0);
		        return null double phonenumber[]= (double) excelWSheet1.getRow(RowNum2).getCell(ColNum2).getNumericCellValue();
		        
		         // return String.valueOf(phonenumber);
		     
		    }}*/
	    

	    




