package general;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {


	public String  readPropertyData(String propPath,String key) throws IOException
	{
		 FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		 String propValue = prop.getProperty(key,"Incorrect Key");
		 return propValue;
		 
	}
	  public String readExcelData(String path,String sheetName,int row,int cell) throws Throwable
	  {
		  FileInputStream fis = new FileInputStream(path);
		  Workbook wb = WorkbookFactory.create(fis);
		  String excelvalue = wb.getSheet(sheetName).getRow(row).getCell(cell).toString();
		  return excelvalue;
		  
		  
	  }
      public void writeExcelData(String path,String sheetName,int row,int cell, String data) throws Throwable
      {
    	  FileInputStream fis = new FileInputStream(path);
    	 Workbook wb = WorkbookFactory.create(fis);
    	 wb.getSheet(sheetName).getRow(row).createCell(cell).setCellValue(data);
    	 
    	 FileOutputStream fos =new FileOutputStream(path);
    			 wb.write(fos);
      }
      
      public int getrowCount(String path,String sheet) throws Throwable
      {
    	 FileInputStream fis = new FileInputStream(path);
    	 Workbook wb = WorkbookFactory.create(fis);
    	 int rowCount = wb.getSheet(sheet).getLastRowNum();
    	 return rowCount; 	 
      }
      
      
      

}
