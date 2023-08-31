package testngs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Exceldataget {

	private static final String[][] Data = null;

	@Test
	
	public String[][] getdata() throws Throwable {
		File file=new File("./target/exceldata123.xlsx");
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(stream);
		 XSSFSheet sheet =workbook.getSheet("Sheet1");
		 int rows=sheet.getPhysicalNumberOfRows();
		 
		 int cells=sheet.getRow(1).getLastCellNum();
		 
		 String [][]data=new String [rows] [cells];
		 
		 
		 
		 for (int i=0;i<rows;i++) {
		 for (int j=0;j<cells;j++) {
		 DataFormatter df=new DataFormatter();
		 Data[i][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
		 
		//System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
		 
		 }
		 for (String[] datas:data) {
			 
		 
		System.out.println(Arrays.toString(datas));
		
		
		

		  }
		 return data;
		 
		 
		 
		
		 }
		
	}
}
