package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobile_pages.LandingPage;
import framework.mobile_pages.LoginPage;
import org.testng.Assert;


public class MobileLoginSD {

    LandingPage landingPage = new LandingPage();
    LoginPage loginPage = new LoginPage();

    @When("^I click on skip button")
    public void clickOnSkipButton() {
        landingPage.tapOnSkipButton();
    }

    @When("^I click on menu button$")
    public void clickOnMenuButton() throws InterruptedException {
        Thread.sleep(30000);
        landingPage.tapOnMainMenuButton();
    }

    @Then("^I verify sidebar menu is displayed$")
    public void verifySidebarMenu() {
        Assert.assertTrue(landingPage.isMenuPresent());
    }

    @When("^I click on favorites button$")
    public void clickOnFavoritesButton() {
        landingPage.clickOnFavorits();
    }

    @Then("^I verify No Sessions Found text displayed$")
    public void verifyText(){
        Assert.assertTrue(landingPage.verifyText());
    }

    @Given("^I am on Splash screen of the ionic conference app$")
    public void goToSplashScreen(){
    }

    @When("^I swipe right (.+) times on tutorials slides$")
    public void swipeRight(int times){
        landingPage.swipeHorizontally( times);
    }

    @Then("^I verify Continue button is displayed$")
    public void verifyContinueButton(){
       Assert.assertTrue(landingPage.getContinueButton());
    }
}
