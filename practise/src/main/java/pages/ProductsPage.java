package pages;
import helper.AppiumSetup;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
@Setter
@Getter
public class ProductsPage extends AppiumSetup {
    public ProductsPage(IOSDriver driver) {
        this.driver = driver;
    }

    private By firstProduct = AppiumBy.accessibilityId("Sauce Labs Backpack");

    public void selectFirstProduct() {
        driver.findElement(firstProduct).click();
    }
}