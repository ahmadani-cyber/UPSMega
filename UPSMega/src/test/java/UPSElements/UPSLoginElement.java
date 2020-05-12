package UPSElements;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class UPSLoginElement {

	@FindBy(id="email")
	public WebElement login;
	@FindBy(id="pwd")
	public WebElement password;
	@FindBy(id="submitBtn")
	public WebElement click;
	@FindBy(xpath="//*[@id='errorMessages']")
	public WebElement text;
	@FindBy(xpath="//*[@id='iw_comp1464681783426']/div/div/div/div/h1/span")
	public WebElement loginlogo;
}

