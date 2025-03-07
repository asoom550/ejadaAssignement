import helper.AppiumSetup;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutFlowTest extends AppiumSetup {
    ProductsPage productsPage;
    ProductDetailsPage productDetailsPage;
    CartPage cartPage;
    LoginPage loginPage;
    CheckoutAddressPage checkoutAddressPage;
    CheckoutPaymentPage checkoutPaymentPage;
    ReviewOrderPage reviewOrderPage;
    CheckoutCompletePage checkoutCompletePage;
    @Test
    public void completeCheckoutFlow() {
        productsPage= new ProductsPage(driver);
        productsPage.selectFirstProduct();
        productDetailsPage= new ProductDetailsPage(driver);
        productDetailsPage.addToCartAndNavigate();
        cartPage= new CartPage(driver);
        cartPage.proceedToCheckout();
       loginPage= new LoginPage(driver);
       loginPage.loginWithSuggestedCredentials();
       checkoutAddressPage = new CheckoutAddressPage(driver);
       checkoutAddressPage.enterAddressDetails("asma", "test", "test", "12345","jordan");
       checkoutPaymentPage= new CheckoutPaymentPage(driver);
       checkoutPaymentPage.enterPaymentDetails("asma alnaanah","5555555555554444","03/30","737");
       checkoutPaymentPage.proceedToReview();
        reviewOrderPage= new ReviewOrderPage(driver);
        reviewOrderPage.confirmOrder();
        checkoutCompletePage= new CheckoutCompletePage(driver);
        Assert.assertEquals(checkoutCompletePage.getConfirmationText(),"Checkout Complete");
    }
}