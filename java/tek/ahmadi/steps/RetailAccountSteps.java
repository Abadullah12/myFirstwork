package tek.ahmadi.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.ahmadi.pages.POMFactory;
import tek.ahmadi.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
	    click(factory.homePage().accountOption);
	    logger.info("user clicked on Account option");
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
		sendText(factory.accountPage().profileNameInputField, nameValue);
		clearTextUsingSendKeys(factory.accountPage().phomeNumberFiled);
		sendText(factory.accountPage().phomeNumberFiled, phoneValue);
		logger.info("user update phone and name");
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
	 click(factory.accountPage().ProfileUpdateButton);
	 logger.info("user click on update button");
	}
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().PersonalInformationUpdatedSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().PersonalInformationUpdatedSuccessfullyMessage));
	   logger.info("user profile information update");
	}
}
