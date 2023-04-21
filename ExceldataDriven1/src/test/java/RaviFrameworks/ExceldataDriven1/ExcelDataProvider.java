package RaviFrameworks.ExceldataDriven1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

	
	@Test(dataProvider="driveTest")
	public void testcaseData(String Greeting, String text, String Id) {
				
		System.out.println(Greeting);
		System.out.println(text);
		System.out.println(Id);
	}
	
	@DataProvider(name="driveTest")
	public Object[][] getData() throws IOException {
		
			//Object[][] data= {{"helo1","text","1"},{"bye","message","3"},{"solo","text3","5"}};
		
		FileInputStream fis= new FileInputStream("E:\\Exceldata2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheetAt(0);
		int rows=sheet.getPhysicalNumberOfRows();
		XSSFRow row=sheet.getRow(0);
		int colcount=row.getLastCellNum();
		Object[][] Data=new Object[rows][colcount];
		for(int i=0;i<rows;i++) {
			
			row=sheet.getRow(i+1);
			for(int j=0;j<colcount;j++) {
				
			System.out.println(	row.getCell(j));
			}
			
		}
		
		
			return Data;
	}
}
