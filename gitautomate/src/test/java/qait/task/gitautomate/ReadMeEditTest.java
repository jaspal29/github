package qait.task.gitautomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ReadMeEditTest {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("https://github.com/login");
		LoginPage loginPage=PageFactory.initElements(driver,LoginPage.class);
		loginPage.EnterUsernameAndPassword("jaspal29","JAS0000pal");
		loginPage.clickSignIn();
		driver.get("https://github.com/jaspal29/BasicTatoc");
	
	   RepoDashboardPage r=PageFactory.initElements(driver,RepoDashboardPage.class);
	   r.ClickOnREADME();
	   ReadMe readme=PageFactory.initElements(driver, ReadMe.class);
	   readme.edit();
	   ReadMeEdit edit=PageFactory.initElements(driver, ReadMeEdit.class);
	   edit.editText("this is the first task given to us ");
	   
	  
  }
  
  
  
  
}
