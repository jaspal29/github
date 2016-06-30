package qait.task.gitautomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	

	WebDriver driver;
	
	
@FindBy(how=How.NAME,using="login")
WebElement username;
	
@FindBy(how=How.ID,using="password")
WebElement password;


@FindBy(how=How.NAME,using="commit")
WebElement signin ;

public LoginPage(WebDriver driver)
{

	this.driver=driver;	
	
}


public void EnterUsernameAndPassword(String uid,String pass)
{
username.sendKeys(uid);
password.sendKeys(pass);
 
}
public void clickSignIn()
{
	signin.click();




}

	
	
	
	
	
}
