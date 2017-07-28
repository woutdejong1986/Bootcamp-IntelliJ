package pages;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WishListPage {

    public WebDriver driver;

    @FindBy(xpath = ".//tr[4]/td[7]/a/i")
    private WebElement deleteButton;

    @FindBy(id = "name")
    private WebElement newWishListField;

    @FindBy(id = "submitWishlist")
    private WebElement submitWishlistButton;

    public WishListPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getTableContent() {
        WebElement wishListTable = driver.findElement(By.xpath("//*[@id='mywishlist']/*/table[1]/tbody"));
        List<WebElement> rows = wishListTable.findElements(By.tagName("tr"));

    }
//
////    public void getTableContent(){
////        int rowCount = driver.findElements(By.xpath("//*[@id='mywishlist']/*/table[1]/tbody")).size();
////
//        for (int i = 1; i <= rowCount; i++)
//        {
//            String rowValue = driver.findElement(By.xpath("tr")).getText();
//
//            if (rowValue.contentEquals("Feel the pain"))
//            {
//                driver.findElement(By.xpath("xpath of add")).click();
//            }
//        }

//    }

    public void deleteWishList() {
        deleteButton.click();

    }
    // To handle the alert that will pop up in the browser
    public void checkAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }
    }

    public void assertWishlistGone(){
        Boolean wishListValidation = driver.findElement(By.xpath("//*[text()[contains(.,'Feel the pain')]]))")).isDisplayed();
        Assertions.assertThat(wishListValidation).isFalse();
    }

    public void addWishlist(String wishlistname){
        newWishListField.sendKeys(wishlistname);
        submitWishlistButton.click();

    }

}
