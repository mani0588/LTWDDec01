package javaPack;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		// identify excel
		XSSFWorkbook wb = new XSSFWorkbook(new File("./src/test/resources/TestData.xlsx"));

		// go to sheet
		XSSFSheet sh1 = wb.getSheet("Sheet1");

		// go to row, colmn and read
		String val = sh1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(val);

		Object[][] data = new Object[5][2];

		// print all values from excel
		for (int row = 0; row < 5; row++) {
			for (int clm = 0; clm < 2; clm++) {
				data[row][clm] = sh1.getRow(row).getCell(clm).getStringCellValue();
				System.out.println(data[row][clm]);
			}
		}

	}

}
