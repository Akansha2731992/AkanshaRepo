package Testing.UST;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ReadDataFromExcel {

	// public static void main(String[] args) throws IOException {
	@Test
	public void readData() throws IOException {
		String filePath = "C:\\Users\\Akansha_Patel\\Downloads\\testtraning\\src\\test\\resources\\testdata\\exceldata.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(filePath);
		XSSFSheet sheet = wb.getSheetAt(0);
		Iterator<Row> listOfRow = sheet.iterator();
		while (listOfRow.hasNext()) {
			Row row = listOfRow.next();
			Iterator<Cell> listOfcell = row.cellIterator();

			while (listOfcell.hasNext()) {
				Cell cell = listOfcell.next();

				switch (cell.getCellType()) {
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + " ");
					break;
				case STRING:
					System.out.print(cell.getStringCellValue() + " ");
					break;
				default:
					break;
				}
			}
			System.out.println();

		}
		wb.close();
	}

}