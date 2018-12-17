package framework;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumWrapperCrossPlatform {

    private static AppiumDriver appiumDriver;

    @Before
    private static void intializeAppiumDriver() throws MalformedURLException {
        appiumDriver = buildAppiumDriverAndroid();}
    public void getAppiumDriver() throws Exception {

        if (appiumDriver == null) {
            intializeAppiumDriver();
            throw new AppiumServerHasNotBeenStartedLocallyException(
                    "An appium server node is not started!");
        }
        if (System.getProperty("platform").equalsIgnoreCase("ios")) {
            prepareDiviceIOS();
        } else if (System.getProperty("platform").equalsIgnoreCase("android")) {
            buildAppiumDriverAndroid();
        }
    }

    public static AppiumDriver buildAppiumDriverAndroid() {



        AppiumDriver appiumDriver = null;
        String appiumServerURL = "http://0.0.0.0:4723/wd/hub";
        String platformName = "android";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        if (System.getProperty("platform").equalsIgnoreCase("ios")) {
            try {
                appiumDriver = new AndroidDriver(new URL(appiumServerURL), capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            prepareDiviceIOS();
        } else if (System.getProperty("platform").equalsIgnoreCase("android")) {
            buildAppiumDriverAndroid();
        }


        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_API_26");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/ulia/workspace/ionic-conference-emulator.apk");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30000);
        capabilities.setCapability("appActivity", "com.applause.automation.ionicconference.MainActivity");
        capabilities.setCapability("appPackage", "com.applause.automation.ionicconference");
        capabilities.setCapability("avd","Pixel_2_API_26");
        try {
            appiumDriver = new AndroidDriver(new URL(appiumServerURL), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return appiumDriver;
    }

    public static AppiumDriver prepareDiviceIOS() {
        AppiumDriver appiumDriver = null;
        String appiumServerURL = "http://0.0.0.0:4723/wd/hub";
        String platformName = "ios";
        File appDir = new File("");
        File app = new File(appDir,"");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUIest");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
        capabilities.setCapability(MobileCapabilityType.PLATFORM, "MAC");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "");
        capabilities.setCapability("udid","");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUIest");
        capabilities.setCapability("appium-version", "1.7.2");
        capabilities.setCapability("autoAcceptAlerts", false);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30000);
        try {
            appiumDriver = new IOSDriver(new URL(appiumServerURL), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return appiumDriver;
    }
    @After("@mobile")
    public static void quitAppiumDriver() {
        if (appiumDriver != null) {
            System.out.println("Quitting Appium..");
            appiumDriver.quit();
            System.out.println("Quitting Appium - Done");
            appiumDriver = null;
        }
    }

}
