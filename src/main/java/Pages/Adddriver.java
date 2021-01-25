package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adddriver {
	Actions action = new Actions(driver);
	WebElement  pilotclick = driver.findElement(By.xpath("//a[contains(text(),'Pilots')]"));
	action.moveToElement(pilotclick).click();
	
	/*@FindBy(xpath=("//a[contains(text(),'Pilots')]"))
	public WebElement pilottab;*/
	@FindBy(xpath="//*[@class='addNewDriver']")
	public WebElement addpilots;
	@FindBy(xpath="//*[@name='first_name']")
	public WebElement fname;
	@FindBy(xpath="//*[@name='last_name']")
	public WebElement lname;
	private WebDriver driver;
	
	public Adddriver(WebDriver driverm) {
		this.driver=driverm;
		PageFactory.initElements(driver,this);
	
	}
	

}
//*[@id="collapsibleNavbar"]/ul/a[2]/li/div/a
	
