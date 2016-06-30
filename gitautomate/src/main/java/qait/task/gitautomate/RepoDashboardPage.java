package qait.task.gitautomate;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepoDashboardPage {
	
	@FindBy(xpath="//*[@id=\"js-repo-pjax-container\"]/div[1]/div[2]/nav/a[4]")
	WebElement settings;
	@FindBy(linkText="README.md")
	WebElement readme;
	
	
	WebDriver driver;
	   
	public RepoDashboardPage(WebDriver driver)
	{
		
		this.driver=driver;
		
		}

	public void clickOnSettings()
	{
		
		
		settings.click();
		
	}

	public String CommitData(String Url,String Message,String Folder) throws IOException, InterruptedException
	{
		
		 StringBuilder Link=new StringBuilder(Url);
		  Link.insert(8,"jaspal29:JAS0000pal@");
		  System.out.println(Link.toString());
		  String str=new String(Link);
		  System.out.println(str);
		  
		  
		  ExecuteShellCommand.push(str,"/home/jaspalchandramola/Desktop",Folder,Message);
		  driver.navigate().refresh();
		 List<WebElement> list=driver.findElements(By.className("message"));
		 String commitMessage=list.get(2).getText();
		return commitMessage;
		
		
	}
	
	
	
	public void ClickOnREADME()
	{
		
		
		 readme.click();
		
		
		 }
	
	
	
	

}