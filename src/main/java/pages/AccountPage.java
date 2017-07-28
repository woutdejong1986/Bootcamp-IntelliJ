package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountPage {

    public WebDriver driver;

    @FindBy(xpath = ".//*[@id='wishlist_block']/*[@class='title_block']/a")
    private WebElement wishListButton;

    @FindBy(xpath = ".bullet>li>a[(contains(text(), 'My personal info'))")
    private WebElement personalInfoButton;

    @FindBy(xpath = ".//*[@id='firstname']")
    private WebElement firstNameField;

    public AccountPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToWishList(){
        wishListButton.click();
    }

    public void goToPersonalInfo(){
        personalInfoButton.click();
    }

    public void enterFirstName(String firstName){
        firstNameField.sendKeys(firstName);
    }

}
