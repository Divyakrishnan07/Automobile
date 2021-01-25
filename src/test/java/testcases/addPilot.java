package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Adddriver;
import Pages.loginpage;
import basepackage.baseclass;

public class addPilot extends baseclass {
	
  public addPilot() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

@BeforeTest
  public void first() {
	loginpage p = new loginpage(driver);
	p.login("1234567890", "12345678");
  }
@Test
  public void addpilot() {
	  Adddriver a = new Adddriver(driver);
	  a.pilottab.click();
	  a.addpilots.click();
	  a.fname.sendKeys("Divya");
	  a.lname.sendKeys("krishnan");
  }
}
