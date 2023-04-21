import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrivenExcel {

	
	//once column is identified , scan entire test case columns to find Purchase row
	//take the Purchase row data- pull all the data 
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			
		FileInputStream fis=new FileInputStream("E:\\SeleniumExcel.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetAt(i).getSheetName().equalsIgnoreCase("testdata")){
				
			XSSFSheet sheet=	workbook.getSheetAt(i);
			//identify test case column by identify first row
			Iterator<Row> rows=sheet.rowIterator();//to go to rows of the sheet
			Row firstrow= rows.next();
				
			  Iterator<Cell> cells=firstrow.cellIterator();
			 // int column=0;
			  while(cells.hasNext()) {//checking if the sheet has rows
				  	Cell value=  cells.next();
				
		if(	value.getStringCellValue().equalsIgnoreCase("Testcases")) {
			
			//this is the desired column
			int column=value.getColumnIndex();
			System.out.println(column);
		}
				  
			 		
			  }
				
				
			}
			}
					
		}

}
