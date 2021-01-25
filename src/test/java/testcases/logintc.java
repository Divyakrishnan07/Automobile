package testcases;
import basepackage.baseclass;
import Pages.loginpage;
import java.io.IOException;
import org.testng.annotations.Test;

public class logintc extends baseclass {
	public logintc() throws IOException {
		super();
	}
	@Test
  public void log()  {
	  loginpage p=new loginpage(driver);
	  p.login(prop.getProperty("mobileno"),prop.getProperty("password"));
  }
}
