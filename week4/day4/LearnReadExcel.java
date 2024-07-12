package week4.day4;

	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class LearnReadExcel {

		
		
		public static void main(String[] args) throws IOException {
			
			//Step1 : Open the work book(Excel file)
			XSSFWorkbook workBook = new XSSFWorkbook("./data/CreateIndividuals.xlsx"); 
			// Step2 : Open the sheet (either by using Sheet name or by using sheet index)
			XSSFSheet sheet = workBook.getSheetAt(0); // by using index
			XSSFSheet sheetName = workBook.getSheet("Sheet1");
			// Step3 : Get the row count
			int rowCount = sheet.getLastRowNum();
			System.out.println(rowCount);
			
			short columnCount = sheet.getRow(0).getLastCellNum();
			System.out.println("First row column count"+columnCount);
			
			short lastCellNum2 = sheet.getRow(1).getLastCellNum();
			System.out.println("Second row column count"+lastCellNum2);
			
			XSSFCell cell = sheet.getRow(1).getCell(0);
			String row10 = cell.getStringCellValue();
			System.out.println("second row first column value is "+ row10);
			
			String row12 = sheet.getRow(1).getCell(2).getStringCellValue();
			System.out.println("Second row third column value is "+ row12);
			
			
			System.out.println("-----------------------------------------");
			
			//Iterate the row first
			for(int i=1; i<=rowCount; i++) {
				
				// Iterate the column
				for(int j =0; j<columnCount; j++) {
					String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(stringCellValue);
				}
				
			}			
			workBook.close();
			
		}
		
	
}
