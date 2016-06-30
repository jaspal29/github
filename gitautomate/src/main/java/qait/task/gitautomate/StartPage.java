package qait.task.gitautomate;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage {
	WebDriver driver ;
	
	@FindBy(xpath="/html/body/header/div/div/div/a[2]")
	private WebElement signInOption;
	
	
	public StartPage(WebDriver driver)
	{
		this.driver=driver;
		
		
	}
	
	
	
	public void PressSignIn()
	{
		
		signInOption.click();
		  
		
		
	}
	
	
	
	
	
	
	

}
