package qait.task.gitautomate;


import java.io.IOException;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class GitRepoCreationTest {
	 String projectName="PROJECT_NAME5";
	 String Description="this is a new project";
	 String username="jaspal29";
	 String password="JAS0000pal";
  
  @Test
  public void beforeTest() throws IOException, InterruptedException {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://github.com/");
	  
	   StartPage page=PageFactory.initElements(driver, StartPage.class);	  
	   page.PressSignIn();
	   
	   LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
       loginPage.EnterUsernameAndPassword(username,password);
       loginPage.clickSignIn();
       
       DashBoard dasboard=PageFactory.initElements(driver, DashBoard.class);
       dasboard.clickNewRepo();
       
       //Test for creation of dictionary 
       NewRepo newRepo=PageFactory.initElements(driver, NewRepo.class);
       newRepo.EnterRepository(projectName,Description);
	  newRepo.createRepository();
       Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"js-repo-pjax-container\"]/div[2]/div[1]/div[1]/div[1]/div/div[3]/div/span/input")).isDisplayed());
	  
	 
       //Test for puttting data in dictionary
      NewRepositoryHomePage newRepoPage=PageFactory.initElements(driver, NewRepositoryHomePage.class);
      
	  RepoDashboardPage newPage=PageFactory.initElements(driver,RepoDashboardPage.class);
	  String commitMessage=newPage.CommitData(newRepoPage.getLink(),"COMMIT_MEASSAGE","FOLDERNAME1");
	 
	  Assert.assertEquals(commitMessage,"COMMIT_MESSAGE");	  
	
	  
	  
	  
	  
	  
  }
  

}
