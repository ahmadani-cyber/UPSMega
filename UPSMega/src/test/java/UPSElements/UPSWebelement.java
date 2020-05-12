package UPSElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UPSWebelement {
	@FindBy(xpath="//*[@id=\"__tealiumImplicitmodal\"]/div/button")
	public WebElement cookie;
	@FindBy(name="countryDropdown")
	public WebElement origin;

	
	@FindBy(xpath="//*[@id='originname\']")
	public WebElement name;
	
	
	@FindBy(id="originaddress1")
	public WebElement FirstAddress;
	
	@FindBy(id="originpostal")
     public WebElement ZipCode;
	
	
	@FindBy(name="city")
	public WebElement city;
	
	@FindBy(id="originstate")
	public WebElement State;
	
	
	@FindBy(id="originemail")
     public WebElement email;
	
	@FindBy(id="originphone")
	public WebElement phone;

	@FindBy(id="originextension")
	public WebElement extension;
	
	
	@FindBy(xpath="//*[@id=\"ups-main\"]/div[8]/app/ng-component/div/div/div/div/ng-component/section/origin/agent/section/div[2]/common-checkbox/div/div/label")
	public WebElement tick;
	
	@FindBy(id="nbsBackForwardNavigationContinueButton")
	public WebElement submit;
	
	@FindBy(id="originnbsAgentSummaryAddressLine1")
	public WebElement msg;
}


