package test_package;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import base_utility.Base_class;

@Listeners(base_utility.Listener.class)
public class Test_class extends Base_class{

	
	@BeforeClass
	public void Initial_Activity() {
		Launch_the_browser("BN");
		Initialize_object();
	}
	
	@Test
	public void FB_Validation_Part() throws EncryptedDocumentException, IOException {
		String Actual = Pom_Obj.Get_welcome_text();
		String Expected = util.Get_Excel_Data(0, 0);
		Assert.assertEquals(Actual, Expected);
	
	}
	@Test
	public void forgot_Pass_validation() throws EncryptedDocumentException, IOException {
		
		String Actual = Pom_Obj.Click_on_Forgot_password();
		String Expected = util.Get_Excel_Data(0, 0);
		Assert.assertEquals(Actual, Expected);
		
	}
	
	@Test
	public void Create_account_validation() throws EncryptedDocumentException, IOException {
		String Actual = Pom_Obj.Click_On_Create_Account();
		String Expected = util.Get_Excel_Data(0, 0);
		Assert.assertEquals(Actual, Expected);
		
	}
	
	@Test
	public void Login_Activity() throws EncryptedDocumentException, IOException {
		Pom_Obj.Enter_Email(util.Get_Excel_Data(0, 0));
		Pom_Obj.Enter_Password(util.Get_Excel_Data(0, 0));
		Pom_Obj.Click_on_LogIn_Button();
	}
	
	@AfterClass
	public void Quite_Browser() {
		Quite_The_Browser();

	}
	
}
