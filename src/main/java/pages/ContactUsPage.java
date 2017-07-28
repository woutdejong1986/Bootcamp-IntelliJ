package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
    private WebDriver driver;

    @FindBy(css = "#email")
    private WebElement emailTextField;

    @FindBy(css = "#id_order")
    private WebElement orderIdTextField;

    @FindBy(id = "message")
    private WebElement messageTextField;

    @FindBy(css = "button#submitMessage")
    private WebElement sendButton;

    public ContactUsPage(WebDriver driver){
        this.driver = driver;

        // This call sets the webelement
        PageFactory.initElements(driver, this);
    }

    public void fillInContactForm(String email, String orderID, String message){
        Select subjectHeading = new Select(driver.findElement(By.cssSelector("select#id_contact")));
        subjectHeading.selectByVisibleText("Customer service");

        emailTextField.clear();
        emailTextField.sendKeys(email);
        orderIdTextField.sendKeys(orderID);
        messageTextField.sendKeys(message);
    }

    public void sendContactForm(){
        sendButton.click();
    }

    public void messageSentSuccesfull(){

        String sentValidation = driver.findElement(By.cssSelector(".alert.alert-success")).getText();
        Assertions.assertThat(sentValidation).as("Message hasn't been sent").isEqualTo("Your message has been successfully sent to our team.");
    }

    public void messageNotSent(){
        String notSentValidation = driver.findElement(By.cssSelector(".alert.alert-danger")).getText();
        Assertions.assertThat(notSentValidation).as("No the right message").isEqualTo("There is 1 error\nInvalid email address.");
    }

    public void formatNotOK(){
        Assertions.assertThat(driver.findElement(By.cssSelector(".form-group.form-error")).isDisplayed());
    }

    public void formatOK(){
        Assertions.assertThat(driver.findElement(By.cssSelector(".form-group.form-ok")).isDisplayed());
    }
}
