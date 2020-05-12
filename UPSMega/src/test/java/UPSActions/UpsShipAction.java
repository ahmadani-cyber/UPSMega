package UPSActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import UPSElements.UPSWebelement;

public class UpsShipAction {
	UPSWebelement webelement;

public UpsShipAction(WebDriver driver) {
	webelement = new UPSWebelement();
	PageFactory.initElements(driver, webelement);
}

//public void cook() {
//	this.webelement.cookie.click();
//}

public void Origin(String str) {
	this.webelement.origin.sendKeys(str);
}

public void Name(String str) {
	this.webelement.name.sendKeys(str);
}

public void firstAddress(String str) {
	this.webelement.FirstAddress.sendKeys(str);
}

public void zipcode(String str) {
	this.webelement.ZipCode.sendKeys(str);

}

public void city(String str) {
	this.webelement.city.sendKeys(str);
}

public void state(String str) {

	this.webelement.State.sendKeys(str);
}

public void email(String str) {
	this.webelement.email.sendKeys(str);
}

public void ext(String str) {
	this.webelement.extension.sendKeys(str);

}

public void phone(String str) {
	this.webelement.phone.sendKeys(str);
}

public void tick() {
	this.webelement.tick.click();
}

public void sbmt() {
	this.webelement.submit.click();

}
public String msg( )
{
	return this.webelement.msg.getText();
}

}
