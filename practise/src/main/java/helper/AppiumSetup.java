package helper;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.URL;
import java.time.Duration;

public class AppiumSetup {
    protected IOSDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("iOS")
                .setPlatformVersion("18.0")
                .setDeviceName("iPhone 16 Pro Max")
                .setAutomationName("XCUITest")
                .setApp("/Users/asmaa.alnaanah/Downloads/MyRNDemoApp.app");

        driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown() {
            driver.quit();
    }
}