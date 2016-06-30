package qait.task.gitautomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReadMeEdit {
	
	WebDriver driver;
	@FindBy(className="ace_text-input")
	WebElement  edit;
	@FindBy(id="submit-file")
	WebElement  submit;
	
	public ReadMeEdit(WebDriver driver)
	{
		
		this.driver=driver;
		
		}
	
	
	
	public void editText(String str )
	{
		
		edit.sendKeys(str);
		submit.click();
		
	}

}
