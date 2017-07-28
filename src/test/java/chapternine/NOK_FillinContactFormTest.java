package chapternine;

import general.TestShopScenario;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class NOK_FillinContactFormTest extends TestShopScenario{

    @Test
    public void fillInWrongContactForm(){

        // Go to the contact page
        HomePage homePage = new HomePage(driver);
        homePage.goToContactPage();

        // Fill in the contact form wrong
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.fillInContactForm("nope", "4321234", "Help!");
        contactUsPage.sendContactForm();

        // Check if message has not been sent
        contactUsPage.messageNotSent();
    }

}
