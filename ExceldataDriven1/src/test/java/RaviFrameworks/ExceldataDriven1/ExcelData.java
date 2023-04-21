package RaviFrameworks.ExceldataDriven1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public ArrayList<String> getData(String testcasename) throws IOException {
		//excel data driving
		
				ArrayList<String> a=new ArrayList<String>();
				FileInputStream fis=new FileInputStream("E:\\SeleniumExcel.xlsx");
				
				XSSFWorkbook workbook= new XSSFWorkbook(fis);
				int sheets=workbook.getNumberOfSheets();
				for(int i=0;i<sheets;i++) {
					//System.out.println(workbook.getSheetAt(i).getSheetName());
					
					if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
					XSSFSheet sheet=	workbook.getSheetAt(i);
					//identify test case column by identify first row
					Iterator<Row> rows=sheet.rowIterator();
					Row firstrow=rows.next();
					int  k=0;
					int column=0;
					Iterator<Cell> cells=firstrow.cellIterator();
					while(cells.hasNext()) {
						
					//System.out.println(cells.next().getStringCellValue());
						Cell value=cells.next();
					if(value.getStringCellValue().equalsIgnoreCase(testcasename)) {
						
						column=k;
						
					}k++;
					}System.out.println(column);
					//once column is identifies scan entire column to get purchase test case
					while(rows.hasNext()) {
						
						Row r=rows.next();
						if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename)) {
							//after getting purcahse test case, pull all teh data
						Iterator<Cell> ce=	r.cellIterator();
						while(ce.hasNext()){
							//System.out.println(ce.next().getStringCellValue());
							Cell c=ce.next();
							if(c.getCellType()==CellType.STRING) {
							a.add(c.getStringCellValue());
							}
							else {
							
							a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
								
							}
						}
						}
					}
					
					}
				}
				return a;
			}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
	}

}
