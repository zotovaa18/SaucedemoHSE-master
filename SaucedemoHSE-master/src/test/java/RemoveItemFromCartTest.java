import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RemoveItemFromCartTest extends BaseTest {

    @Test
    public void test() {
        loginPage.open()
                .login("standard_user", "secret_sauce")
                .isPageOpened()
                .addToCart("Sauce Labs Backpack")
                //.addToCart("Sauce Labs Bike Light")
                .clickCart()
                .clickRemoveItemFromCart("Sauce Labs Backpack")
                .findItem("Sauce Labs Backpack");
        }
}
