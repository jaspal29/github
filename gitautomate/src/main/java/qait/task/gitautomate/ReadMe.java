package qait.task.gitautomate;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;


public class ReadMe {
	WebDriver driver;
	@FindBy(css="button[data-hotkey='e']")
	WebElement  edit;
	
	public ReadMe(WebDriver driver)
	{
		
		this.driver=driver;
		
		}
	
	
	
	
	public void edit() throws InterruptedException
	{ 
		Thread.sleep(3000);
		edit.click();
		
		
		
	}

}
