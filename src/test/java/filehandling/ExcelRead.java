package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1=new FileInputStream("D:\\FLM5thDec\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		

	}

}
