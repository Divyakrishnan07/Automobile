package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public static Properties prop;
	public static WebDriver driver;
	public baseclass()throws IOException 
 {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		prop=new Properties();
		FileInputStream file;
		file = new FileInputStream("C:\\Selenium\\Projects\\src\\main\\java\\properties\\input.properties");
        prop.load(file);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}

}
