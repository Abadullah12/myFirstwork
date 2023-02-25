package tek.ahmadi.pages;

import org.openqa.selenium.support.PageFactory;

import tek.ahmadi.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	public RetailOrderPage () {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	
}
