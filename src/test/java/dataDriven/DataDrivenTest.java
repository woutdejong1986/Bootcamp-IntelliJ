package dataDriven;

import general.TestShopScenario;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class DataDrivenTest extends TestShopScenario {

    @Parameters({"email", "orderID", "message"})
    @Test
    public void contactForm(String email, String orderID, String message){

        // Go to contact page from homepage
        HomePage homePage = new HomePage(driver);
        homePage.goToContactPage();

        // Fill in the contact form
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.fillInContactForm(email, orderID, message);
        contactUsPage.sendContactForm();

        // Check if the message has been sent
        contactUsPage.messageSentSuccesfull();
    }

}
