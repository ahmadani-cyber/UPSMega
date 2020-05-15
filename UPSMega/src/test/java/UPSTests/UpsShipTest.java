package UPSTests;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import UPSActions.UpsShipAction;
import UPSDrivers.UPSdriver;

public class UpsShipTest extends UPSdriver  {
	WebDriver driver = getChromeDriver();
UpsShipAction loginActions = new UpsShipAction(this.driver);
final String URL = "https://www.ups.com/ship/guided/origin?tx=1556007685144378&loc=en_US";

@BeforeMethod(alwaysRun=true)
public void beforeMethod() {
	driver.get(URL);
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@Test(priority=1,groups= {"regression test"})
public void ShippingAccount() {
	//loginActions.cook();

loginActions.Origin("United States");
	loginActions.Name("Daniyal");
	loginActions.firstAddress("52 Flower Road");
	loginActions.zipcode("11581");
	loginActions.city("VALLEY STREAM");

	loginActions.state("New York");

	loginActions.email("butt.daniyalahmad1992@gmail.com");
	loginActions.phone("5167273017");
	loginActions.ext("111");

	loginActions.tick();
	loginActions.sbmt();
	String nextpage = loginActions.msg();

	boolean bool;

	if (nextpage.isEmpty()) {
		bool = false;
	} else {
		bool = true;
	}
	System.out.println("Shipping account test");
Assert.assertEquals(bool, true);
}

@Test(priority=2,groups= {"sanity test"})
public void title()
{String actualtitle="Shipping | UPS - United States";
System.out.println("Actual page title"+actualtitle);
String expectedtitle=driver.getTitle();
System.out.println("Expected page title"+expectedtitle);
Assert.assertEquals(actualtitle, expectedtitle);
}



//@AfterMethod
//public void afterTest() {
//
//	driver.close();
//
//}


}
