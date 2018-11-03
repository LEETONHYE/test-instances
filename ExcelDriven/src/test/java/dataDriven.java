import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class dataDriven {

	//identify testcase coloum by scanning the entire 1st row
	//once coloum is identified then scan entire testcase coloum to identify purchase testcase row
	//after grabbing purchase testcase row = pull all the data of that row and feed into test

	public ArrayList<String> getData(String testcaseName) throws IOException {
		
		ArrayList<String> a=new ArrayList<String>();
		FileInputStream fis=new FileInputStream("C://Study//selenium//demodata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("Testcase")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> rows=sheet.iterator();//sheet is the collection of rows
				Row firstrow=rows.next();
				Iterator<Cell> ce=firstrow.cellIterator();//row is collection of cells
				int k=0;
				int column=0;
				while(ce.hasNext()) {
					Cell fstce=ce.next();
					if(fstce.getStringCellValue().equalsIgnoreCase("Testcases")) {
						column=k;// to acquire the index of goal column
					}
					k++;
				}
				System.out.println(column);
				//once column is identified then scan entire testcase coloum to identify purchase testcase row
				while(rows.hasNext()) {
					Row row=rows.next();
					if(row.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
						//after grabbing purchase testcase row = pull all the data of that row and feed into test
						Iterator<Cell> cel=row.cellIterator();
						while(cel.hasNext()) {
								Cell c=cel.next();
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
