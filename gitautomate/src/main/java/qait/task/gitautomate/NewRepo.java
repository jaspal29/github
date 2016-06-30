package qait.task.gitautomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRepo {
	WebDriver driver;
	
	@FindBy(id="repository_name")
	private WebElement repositoryName;
	
	@FindBy(id="repository_description")
	private WebElement Descriptoin;
	
	@FindBy(xpath="//*[@id=\"new_repository\"]/div[4]/button")
	private WebElement create;
	
	 public NewRepo(WebDriver driver) {
		 this.driver=driver;		
	 
	 }
	
	 public void EnterRepository(String name,String description)
	 {
	 repositoryName.sendKeys(name);
	 Descriptoin.sendKeys(description);

	 }	
	
	 public void createRepository()
	 {
		create.click();
		 
		 
	 }



}
