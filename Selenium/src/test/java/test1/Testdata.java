package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testdata {

	public static void main(String[] args) throws Throwable {

		File file=new File("./target/exceldata.xlsx");//file
		//System.out.println(file.exists());
		FileInputStream stream=new FileInputStream(file);//file lo ready cheyadaniki input stream
		
		XSSFWorkbook workbook=new XSSFWorkbook(stream);// stream lo nunchi work book ki convert cheyali
		
		XSSFSheet sheet=workbook.getSheet("Sheet1"); //sheet lo name , index untai
		
		//System.out.println(sheet.getPhysicalNumberOfRows());
		//System.out.println(sheet.getLastRowNum());
		
		int rows=sheet.getPhysicalNumberOfRows();
		
		int cells=sheet.getRow(1).getLastCellNum();
		
		for(int i=1;i < rows;i++) {
			
			for(int j=1; j< cells; j++) {
				
				DataFormatter df=new DataFormatter();
				
				System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
				System.out.println();
			}
			
		}
		
	}

}
