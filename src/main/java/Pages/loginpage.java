package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div/div[2]/div/input")
	WebElement number;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div/div[3]/div/input")
    WebElement password;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div/div[5]/button")
	WebElement login;
	public WebDriver driver;
	
	public loginpage(WebDriver driverm) {
		this.driver=driverm;
		PageFactory.initElements(driver,this);
		
	}
	public void login(String num,String pwd)
	{
		number.sendKeys(num);
		password.sendKeys(pwd);
		login.click();
		
	}
}

