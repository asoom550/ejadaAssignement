package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class CheckoutCompletePage {
    private final IOSDriver driver;

    private final By confirmationMessage = AppiumBy.accessibilityId("Checkout Complete");

    public CheckoutCompletePage(IOSDriver driver) {
        this.driver = driver;
    }

    public String getConfirmationText() {
        return driver.findElement(confirmationMessage).getText();
    }

}