package ExcelDataDriverFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public ArrayList<String> getData(String testcaseName) throws IOException {

		FileInputStream fis = new FileInputStream("C:/Users/S Santhosh Kumaran/Demo Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		ArrayList<String> arr = new ArrayList<String>();

		int worksheets = workbook.getNumberOfSheets();
		System.out.println(worksheets);
		for (int i = 0; i < worksheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {

				XSSFSheet sheet = workbook.getSheetAt(i);
				System.out.println(sheet);
				// Identify the testsheet column by accessing the first row

				Iterator<Row> rows = sheet.iterator(); // sheet is the collection of rows
				Row FirstRow = rows.next();
				Iterator<Cell> ce = FirstRow.cellIterator(); // row is the collection of cells
				int k = 0;
				int column = 0;
				while (ce.hasNext()) {// it checks only if the next cell is present or not
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						column = k;

					}
					k++;
				}
				System.out.println(column);

				// Scan all the rows and check where the purchase test case row is present
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
						// Grab all the cell content in the rows
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
//							System.out.println(cv.next().getStringCellValue());
							Cell c=cv.next();
							if(c.getCellType()==CellType.STRING) {
								arr.add(c.getStringCellValue());
							}else {
								arr.add(NumberToTextConverter.toText(c.getNumericCellValue()));
								
							}
							
							System.out.println(arr);

						}

					}
				}

			}

		}
		return arr;

	}

	public static void main(String[] args) throws IOException {
		// it only accepts as the input file stream objects

	}

}
