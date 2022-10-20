package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class_fb {
	
	public Pom_class_fb(WebDriver Driver) {
		
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")private WebElement Email_Input;

	@FindBy(xpath="//input[@type='password']")private WebElement Password_Input;

	@FindBy(xpath="//button[@type='submit']")private WebElement LogIn_Button_Input;

	@FindBy(xpath="	//a[text()='Forgotten account?']")private WebElement Forgot_password;
	
	@FindBy(xpath="	//a[@rel='nofollow']")private WebElement SignUp_For_FB;

	public void Enter_Email(String email) {
		Email_Input.sendKeys(email);
	}
	
	public void Enter_Password(String password) {
		Password_Input.sendKeys(password);
	}
	
	public void Click_on_LogIn_Button() {
		LogIn_Button_Input.click();
	}
	
	public void Click_on_Forgot_password() {
		 Forgot_password.click(); 
	}
	
	public void Click_on_signUp() {
		SignUp_For_FB.click();
	}
	
	
	
	
	
	
	
	
}
