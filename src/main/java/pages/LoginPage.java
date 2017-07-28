package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    @FindBy(css = "#email")
    private WebElement userName;

    @FindBy(css = "#passwd")
    private WebElement passWord;

    @FindBy(css = "#SubmitLogin")
    private WebElement submitLoginButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterCredentials(String email, String password){
        userName.clear();
        userName.sendKeys(email);
        passWord.sendKeys(password);
    }

    public void clickSubmitLoginButton(){
        submitLoginButton.click();
    }

    public void validateSuccessfulLogin(){
        String loginValidation = driver.findElement(By.cssSelector(".page-heading")).getText();
        Assertions.assertThat(loginValidation).as("Not on account page, login failed!").isEqualTo("MY ACCOUNT");
    }

    public void validateWrongLogin(){
        String loginValidation = driver.findElement(By.cssSelector(".page-heading")).getText();
        Assertions.assertThat(loginValidation).as("Wrong credentials given, login should fail").isEqualTo("AUTHENTICATION");
    }

}
