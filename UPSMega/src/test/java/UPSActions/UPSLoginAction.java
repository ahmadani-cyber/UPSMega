package UPSActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import UPSElements.UPSLoginElement;

public class UPSLoginAction {
	UPSLoginElement webelement;

	public UPSLoginAction(WebDriver driver) {

		this.webelement = new UPSLoginElement();
		PageFactory.initElements(driver, webelement);

	}

	public void login(String log) {
		this.webelement.login.sendKeys(log);
	}

	public void pass(String pas) {
		this.webelement.password.sendKeys(pas);

	}

	public void sbmt() {
		this.webelement.click.click();
	}

	public String errormsg() {
		return this.webelement.text.getText();
	}

	public String loginlogo() {
		return this.webelement.loginlogo.getText();
	}

}
