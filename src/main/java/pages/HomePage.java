package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver;

    @FindBy(css = "#contact-link > a")
    private WebElement contactButton;

    @FindBy(css = ".login")
    private WebElement loginButton;

    @FindBy(css = ".logout")
    private WebElement logoutButton;

    @FindBy(xpath = ".//*[@id='wishlist_block']/*[@class='title_block']/a")
    private WebElement wishListButton;

    public HomePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToContactPage(){
        contactButton.click();
    }

    public void goToLoginPage(){
        loginButton.click();
    }

    public void logout(){
        logoutButton.click();
    }

    public void goToWishlistPage(){
        wishListButton.click();
    }

}
