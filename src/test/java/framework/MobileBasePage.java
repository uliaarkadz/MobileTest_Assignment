package framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//mport io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static framework.AppiumWrapper.getAppiumDriver;
//import static io.appium.java_client.touch.WaitOptions.waitOptions;
//import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class MobileBasePage {


    /**
     * This is a constructor which initializes initPageElements()
     */
    public MobileBasePage() {
        initPageElements();
    }

    /**
     * This method handles wait functionality for mobile actions, which means if the element is not found
     * during test then the app will re-try and wait up to 15 seconds before failing the test step
     */
    protected void initPageElements() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver(), 15, TimeUnit.SECONDS), this);
    }

    /**
     * This method is used to tap on element
     *
     * @param mobileElement element to tap on
     */
    protected void tapOn(MobileElement mobileElement) {
        try {
            mobileElement.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    /**
     * This method is used to set value in text field
     *
     * @param mobileElement
     * @param setValue
     */
    protected void setValue(MobileElement mobileElement, String setValue) {

        try {
            mobileElement.sendKeys(setValue);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    /**
     * This method is used to verify if element is displayed
     *
     * @param mobileElement
     * @return
     */
    protected boolean isElementDisplayed(MobileElement mobileElement) {
        try {
            boolean result;
            result = mobileElement.isDisplayed();
            if (result == true)
                return true;
            else {
                return false;
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }


    protected boolean isElementPresent(MobileElement mobileElement) {
        try {
            Dimension count = mobileElement.getSize();
            if (count == null)
                return false;
            else {
                return true;
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    protected String getTextFromElement(MobileElement mobileElement) {
        String text;
        try {
            text = mobileElement.getText();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Element is not found with this locator: " + mobileElement.toString());
        }
        return text;
    }

    public void swipeScreenHorizontally(int times) {

        Dimension size = AppiumWrapper.getAppiumDriver().manage().window().getSize();
        int anchor = size.height / 2;
        int startPoint = (int) (size.width * 0.8);
        int endPoint = (int) (size.width * 0.2);
        System.out.println("Size: " + size);
        System.out.println("Start Point: " + startPoint);
        System.out.println("End Point: " + endPoint);
        TouchAction touchAction = new TouchAction(AppiumWrapper.getAppiumDriver());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < times; i++) {
            touchAction.press(startPoint, anchor).moveTo(endPoint, anchor).release().perform();
        }
    }

}




