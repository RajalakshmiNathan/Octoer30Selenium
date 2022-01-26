package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		System.out.println("rowCount"+rowCount);
		for(int i=1;i<=rowCount;i++) {
			
			int cellCount = ws.getRow(i).getLastCellNum();
			
			for(int j=0;j<cellCount;j++) {
				
				String text = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println("text:"+text);
			}
			
		}
		wb.close();

	}

}
