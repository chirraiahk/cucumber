package qaclickacademy.MavenJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("Libraries\\Documents\\datadriven.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
        for(int i=0;i<sheets;i++) {
        	 if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
        	 XSSFSheet sheet=workbook.getSheetAt(i);
        	Iterator<Row> rows=sheet.iterator();
        	Row  Firstrow = rows.next();
        	 Iterator<Cell> ce=Firstrow.iterator();
        	  while(ce.hasNext()) {
        		  
        	  }
        	 
        	 }
        }
	}

}
