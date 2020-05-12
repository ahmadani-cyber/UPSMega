package UPSTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UPSActions.UPSLoginAction;
import UPSDrivers.UPSdriver;

public class UPSLoginTest extends UPSdriver {WebDriver driver = getChromeDriver();
UPSLoginAction logaction = new UPSLoginAction(this.driver);
final String url = "https://www.ups.com/lasso/login";

@BeforeMethod(alwaysRun = true)
public void beforemethod() {
	driver.get(url);
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

}

@Test(priority=3,groups= {"regression test"}) 
public void logintest() {
	logaction.login("daniyal");
	logaction.pass("password");
	logaction.sbmt();

	String errortext = logaction.errormsg();

	boolean bool;
	if (errortext.isEmpty()) {
		bool = false;
	} else {
		bool = true;
	}
	
	Assert.assertEquals(bool, true);
	
	System.out.println("login verification test");
}

@Test(priority=1,groups= {"regression test"})
public void logotest() {
	String actuallogo = logaction.loginlogo();
	System.out.println("Actual login logo:" + actuallogo);
	String expectedlogo = "Login";
    System.out.println("expected login logo:" + expectedlogo);
    
  Assert.assertEquals(actuallogo, expectedlogo);  
   
    

}

@Test(priority=2,groups= {"sanity test"})
public void verifyUpsLoginPageTitle() {
	String expectedTitle = "Login | UPS - United States";
	String actualTitle = driver.getTitle();
	System.out.println("verifyUpsLoginPageTitle() executed");
	Assert.assertEquals(actualTitle, expectedTitle);
}


//@AfterMethod
//public void closechrome() {
//	driver.close();
//}


}
