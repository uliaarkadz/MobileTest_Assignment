package framework.mobile_pages;

import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LandingPage extends MobileBasePage {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='SKIP ']")
    @iOSFindBy(accessibility = "yesButton")
    private MobileElement yesButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.widget.Button[1]")
    private MobileElement mainMenu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Menu']")
    private MobileElement sidebarHeader;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[@content-desc='FAVORITES ']")
    private MobileElement favoritesButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='No Sessions Found']")
    private MobileElement sessionText;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='CONTINUE arrow forward ']")
    private MobileElement continueButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='options ']")
    private MobileElement filterButton;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Angular']")
    private MobileElement angularButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Reset All Filters ']")
    private MobileElement resetFilterButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View[@content-desc='Angular']//following-sibling::android.widget.CheckBox")
    private MobileElement allOptions;


    public void tapOnSkipButton() {
        tapOn(yesButton);
    }

    public void tapOnMainMenuButton() {
        tapOn(mainMenu);
    }

    public boolean isMenuPresent() {
        return isElementDisplayed(sidebarHeader);
    }

    public boolean skipButtonPresent() {
        return isElementDisplayed(yesButton);
    }

    public void clickOnFavorits() {
        tapOn(favoritesButton);
    }

    public boolean verifyText() {
        return isElementDisplayed(sessionText);
    }

    public void swipeHorizontally(int times) {
        swipeScreenHorizontally(times);
    }

    public boolean getContinueButton() {
        return isElementDisplayed(continueButton);
    }

    public void getHomePage() {
        tapOn(yesButton);
    }

    public void tapOnFilter() {
        tapOn(filterButton);
    }

    public void tapOnAngular() {
        tapOn(angularButton);
    }

    public void clickOnResetFilterButton() {
        tapOn(resetFilterButton);
    }

    public boolean verifyOoptionsEnabled() {
        return disableButton(allOptions);
    }
}
