package chaptersix;

import general.TestShopScenario;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by Selenium on 21-7-2017.
 */
public class EmptyCartTest extends TestShopScenario {

    @Test
    public void emptyCard(){

        if (driver.findElement(By.xpath(".//*[@class='ajax_cart_no_product'][contains(text(), '(empty)')]")).isDisplayed())
        {
            fillCart();
        }

        // Navigate to shopping cart
        driver.findElement(By.xpath(".//*[@class='shopping_cart']/a[@title='View my shopping cart']")).click();

        // Delete item in shopping cart
        driver.findElement(By.xpath(".//*[@class='icon-trash']")).click();

    }
    public void fillCart(){

        // Check if shopping cart is present and empty
        Assertions.assertThat(driver.findElement(By.xpath(".//*[@class='ajax_cart_no_product'][contains(text(), '(empty)')]")).isDisplayed());

        // Click on iPod tag
        driver.findElement(By.cssSelector(".tag_level3.first_item[title='More about ipod']")).click();

        // Click on iPod shuffle (text)
        driver.findElement(By.xpath(".//*[@class='product-name'][@title='iPod shuffle']")).click();

        // Add item to shopping cart
        driver.findElement(By.xpath(".//*[@id='add_to_cart']/button")).click();

        WebElement continueShopping = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@title='Continue shopping']")));
        continueShopping.click();
    }
}
