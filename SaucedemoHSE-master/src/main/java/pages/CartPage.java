package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage {

    WebDriver driver;
    String removeButton = "//div[text()='%s']/ancestor::div[@class = 'cart_item']//button";

    String item = "//div[text()='%s']";

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage clickRemoveItemFromCart(String product) {
        driver.findElement(By.xpath(String.format(removeButton, product))).click();
        return this;
    }

    public void findItem(String product) {
        try {
            if (driver.findElement(By.xpath(String.format(item, "Sauce Labs Backpack"))).isDisplayed()) {
                throw new AssertionError("Товар найден в корзине. Тест не пройден.");
            }
        } catch (org.openqa.selenium.NoSuchElementException ignored) {}
    }

}
