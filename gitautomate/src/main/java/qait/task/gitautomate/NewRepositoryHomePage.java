package qait.task.gitautomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRepositoryHomePage {
	
	
	WebDriver driver;
   
	public NewRepositoryHomePage(WebDriver driver)
	{
		
		this.driver=driver;
		
		
		
	}
	
	
	public String getLink()
	{
		
		String str =driver.getCurrentUrl()+".git";
		return str;
		
	}
	
	

	
	
	

	
}
