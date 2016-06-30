package qait.task.gitautomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"your_repos\"]/div[1]/a")
	WebElement newRepository;
	
	
	public DashBoard(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	public void clickNewRepo(){
		
		newRepository.click();		
		
		
	}
	
}
