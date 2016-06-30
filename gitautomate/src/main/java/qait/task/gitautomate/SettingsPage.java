package qait.task.gitautomate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage {
	WebDriver driver;
	@FindBy(xpath="//*[@id='options_bucket']/div[5]/div/button[2]")	
	WebElement Delete_Button;
	
	@FindBy(id="rename_field")
	WebElement DirectoryName;
	
	
	@FindBy(xpath="//*[@id=\"facebox\"]/div/div/form/p/input")
	WebElement PutName;
	
	@FindBy(xpath="//*[@id=\"facebox\"]/div/div/form/button")
	WebElement ConfirmDelete;
	
	@FindBy(id="repo_listing")
	WebElement web;
	public SettingsPage(WebDriver driver)
	{
		
		this.driver=driver;
		
		}
	
	
	public boolean delete() throws InterruptedException
	{ 
		System.out.println(DirectoryName.getAttribute("value").toString());		
		Delete_Button.click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);		
		
		PutName.sendKeys(DirectoryName.getAttribute("value").toString());
         ConfirmDelete.click();
        
  	   String str=web.getText();
  	 return(str.contains("New_Project12"));
         
        
         
         
         
		
		
		
	}

}
