package base_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Utility_class {
	WebDriver driver;
	
	public Utility_class(WebDriver driver2) {
		driver=driver2;
		
		
	}
	Utility_class util=new Utility_class(driver);
	
	public String Get_Excel_Data(int row,int cell1) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\kumaw\\OneDrive\\Desktop\\SSTUDY.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Facebook_Login");
		Cell cell = sheet.getRow(row).getCell(cell1);
		try {
			return
			cell.getStringCellValue();		
		} catch (Exception e) {
			return
			(int)cell.getNumericCellValue()+"";		
		}
	}
	public void Get_Screenshot(String tc_name) throws IOException {
		Date d=new Date();
		DateFormat df=new SimpleDateFormat("_mm_ss_hh_dd_MM_yyyy");
		String formatedDate =df.format(d);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		;
		File dest=new File("C:\\Users\\Dell\\Desktop\\ss\\"+tc_name+formatedDate+".png");
		FileHandler.copy(src, dest);
		
	}
	

}
