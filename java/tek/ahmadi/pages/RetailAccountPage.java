package tek.ahmadi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.ahmadi.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//img[@id='profileImage']")
	public WebElement profileImage;
	
	@FindBy(id = "nameInput")
	public WebElement profileNameInputField;
	
	@FindBy(xpath="//input[@id='personalPhoneInput']")
	public WebElement phomeNumberFiled;
	
	@FindBy(xpath = "//button[text()='Update']")
	public WebElement ProfileUpdateButton;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement PersonalInformationUpdatedSuccessfullyMessage;
	
	

}
