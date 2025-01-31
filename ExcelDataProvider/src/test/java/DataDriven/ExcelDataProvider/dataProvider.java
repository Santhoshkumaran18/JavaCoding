package DataDriven.ExcelDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	DataFormatter formatter=new DataFormatter();
	// we can pass multiple set of data in the form of arrays
	@Test(dataProvider = "driveTest")
	public void testCaseData(String Greeting, String Communication, String ID) {
		System.out.println(Greeting + Communication + ID);

	}
//
//	@DataProvider(name = "driveTest")
//	public Object[][] getData() {
//
//		Object[][] data = { { "Hello", "Text", 1 }, { "Sanjay", "Santhosh", 2 }, { "Srinivasan", "Umasankari", 3 } };
//		// Every row of cells need to get into the row
//		return data;
//
//	}
	
	

	@DataProvider(name = "driveTest")
	public Object[][] getData() throws IOException {

		// Every row of cells need to get into the row
		
		FileInputStream fis = new FileInputStream("C:/Users/S Santhosh Kumaran/TestData driven.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		System.out.println(wb.getNumberOfNames());
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		XSSFRow row = sheet.getRow(0);
		int columncount=row.getLastCellNum();
		System.out.println(columncount);
		Object data[][]=new Object[rowcount-1][columncount];
		for (int i=0;i<rowcount-1;i++) {
			row=sheet.getRow(i+1); //to get the first row of the excel rather than the header
			for(int j=0;j<columncount;j++) {
					XSSFCell cell= row.getCell(j);	
					data[i][j]=formatter.formatCellValue(cell);
			}
		}
		return data;
	}

}
