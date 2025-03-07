package pages;
import helper.AppiumSetup;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
@Setter
@Getter
public class CheckoutAddressPage extends AppiumSetup {
    public CheckoutAddressPage(IOSDriver driver) {
        this.driver = driver;
    }

    private By fullName = AppiumBy.accessibilityId("Full Name* input field");
    private By addressLine1 = AppiumBy.accessibilityId("Address Line 1* input field");
    private By city = AppiumBy.accessibilityId("City* input field");
    private By zipCode = AppiumBy.accessibilityId("Zip Code* input field");
    private By countryVal = AppiumBy.accessibilityId("Country* input field");
    private By toPaymentBtn = AppiumBy.accessibilityId("To Payment");
    private By closeKeyboard = AppiumBy.accessibilityId("Return");

    public void enterAddressDetails(String name, String address, String cityVal, String zip, String country) {
        driver.findElement(fullName).sendKeys(name);
        driver.findElement(addressLine1).sendKeys(address);
        driver.findElement(city).sendKeys(cityVal);
        driver.findElement(zipCode).sendKeys(zip);
        driver.findElement(countryVal).sendKeys(country);
        driver.findElement(closeKeyboard).click();
        driver.findElement(toPaymentBtn).click();

    }
}