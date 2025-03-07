package pages;
import helper.AppiumSetup;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductDetailsPage extends AppiumSetup {
    public ProductDetailsPage(IOSDriver driver) {
        this.driver = driver;
    }

    private By addToCartBtn = AppiumBy.accessibilityId("Add To Cart button");
    private By cartIcon = AppiumBy.xpath("//XCUIElementTypeButton[@name='tab bar option cart']");

    public void addToCartAndNavigate() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
    }
}