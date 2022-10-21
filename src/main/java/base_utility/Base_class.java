/package base_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import pom_package.Pom_class_fb;

public class Base_class {
	
	public static WebDriver Driver;
	public static Utility_class util;
	public static Pom_class_fb Pom_Obj;
	
	
	public static void Initialize_object() {
		System.out.println("objects Initialize");
		util=new Utility_class(Driver);
		Pom_Obj= new Pom_class_fb(Driver);
	}
	public static void Launch_the_browser(String Browsernames) {
		switch (Browsernames) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\Newchromed 106v\\chromedriver_win32 (1)\\chromedriver.exe");
			Driver = new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\Newchromed 106v\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			Driver = new ChromeDriver();
		default:
			Reporter.log("No browser found"+Browsernames,true);
			break;
		}
		Driver.get("https://www.facebook.com/");
	}
	
	public static void Quite_The_Browser() {
		Driver.quit();
	}
	
	public static void Static_Wait(int sec) throws InterruptedException {
		Thread.sleep(sec * 1000);
	}
	
	
	
}
