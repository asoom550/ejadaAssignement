package pages;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
@Setter
@Getter
public class CheckoutPaymentPage {
    private final IOSDriver driver;

    private final By fullNameField = AppiumBy.accessibilityId("Full Name* input field");
    private final By cardNumberField = AppiumBy.accessibilityId("Card Number* input field");
    private final By expirationField = AppiumBy.accessibilityId("Expiration Date* input field");
    private final By securityCodeField = AppiumBy.accessibilityId("Security Code* input field");
    private final By assetToCloseKeyboard = AppiumBy.accessibilityId("assets/src/assets/images/cards-icon.png");
    private final By reviewOrderBtn = AppiumBy.accessibilityId("Review Order button");

    public CheckoutPaymentPage(IOSDriver driver) {
        this.driver = driver;
    }

    public void enterPaymentDetails(String name,String cardNumber, String expiration, String securityCode) {
        driver.findElement(fullNameField).sendKeys(name);
        driver.findElement(cardNumberField).sendKeys(cardNumber);
        driver.findElement(expirationField).sendKeys(expiration);
        driver.findElement(securityCodeField).sendKeys(securityCode);
    }

    public void proceedToReview() {
        driver.findElement(assetToCloseKeyboard).click();
        driver.findElement(reviewOrderBtn).click();
    }
}