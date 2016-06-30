package qait.task.gitautomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteTest {
	@Test
	public void test() throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver","/home/jaspalchandramola/chromedriver");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		LoginPage loginPage=PageFactory.initElements(driver,LoginPage.class);
		loginPage.EnterUsernameAndPassword("jaspal29","JAS0000pal");
		loginPage.clickSignIn();
		driver.get("https://github.com/jaspal29/New_Project6");
	
	   RepoDashboardPage r=PageFactory.initElements(driver,RepoDashboardPage.class);
	   r.clickOnSettings();
	   SettingsPage s= PageFactory.initElements(driver,SettingsPage.class);
	   Thread.sleep(3000);
	   Assert.assertEquals(false,s.delete());
	   
	
	
	}

}
