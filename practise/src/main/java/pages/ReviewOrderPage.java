package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
@Setter
@Getter
public class ReviewOrderPage {
    private final IOSDriver driver;

    private final By placeOrderBtn = AppiumBy.accessibilityId("Place Order button");

    public ReviewOrderPage(IOSDriver driver) {
        this.driver = driver;
    }

    public void confirmOrder() {
        driver.findElement(placeOrderBtn).click();
    }
}