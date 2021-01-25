package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public Properties prop;
	public WebDriver driver;
	public baseclass()throws IOException {
		System.setProperty("webdriver.chrome.driver","M:\\selenium\\driver\\chromedriver.exe");
		prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Eclipse\\Project\\Automobile\\src\\main\\java\\properties\\input.properties");
		prop.load(file);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}

}
