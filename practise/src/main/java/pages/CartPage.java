package pages;
import helper.AppiumSetup;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
@Setter
@Getter
public class CartPage extends AppiumSetup {
    public CartPage(IOSDriver driver) {
        this.driver = driver;
    }

    private By proceedCheckoutBtn = AppiumBy.accessibilityId("Proceed To Checkout button");

    public void proceedToCheckout() {
        driver.findElement(proceedCheckoutBtn).click();
    }
}