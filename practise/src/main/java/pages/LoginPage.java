package pages;
import helper.AppiumSetup;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
@Setter
@Getter
public class LoginPage extends AppiumSetup {
    public LoginPage(IOSDriver driver) {
        this.driver = driver;
    }

    private By suggestedUsername = AppiumBy.accessibilityId("bob@example.com-autofill");
    private By loginBtn = AppiumBy.accessibilityId("Login button");

    public void loginWithSuggestedCredentials() {
        driver.findElement(suggestedUsername).click();
        driver.findElement(loginBtn).click();
    }
}