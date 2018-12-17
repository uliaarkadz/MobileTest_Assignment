package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobile_pages.LandingPageDice;

public class DiceiOSSD {
    LandingPageDice diceLP = new LandingPageDice();

//    @Given("^I am on a home page of the Diceapp$")
//    public void goToApp() {
//    }

    @When("^I click on roll button$")
    public void clickOnRollButton() {
        diceLP.tapOnRollButton();
    }

    @When("^I verify the image is displayed$")
    public void verifyImageDisplayed() {
        diceLP.verifyDiceLogo();
    }
    @Then("^I verify dice is displayed$")
    public void verifydiceDisplayed() {
    }

}
