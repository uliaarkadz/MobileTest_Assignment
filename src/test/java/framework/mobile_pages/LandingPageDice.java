package framework.mobile_pages;

import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LandingPageDice extends MobileBasePage {

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Roll']")
    private MobileElement rollButton;

    @iOSFindBy(xpath = "//XCUIElementTypeImage[@name='diceeLogo']")
    private MobileElement logo;

    @iOSFindBy(id = "diceeLogo")
    private MobileElement diceLeft;

    public void tapOnRollButton() {
        tapOn(rollButton);
    }

    public void verifyDiceLogo() {
        isElementDisplayed(logo);
    }




}
