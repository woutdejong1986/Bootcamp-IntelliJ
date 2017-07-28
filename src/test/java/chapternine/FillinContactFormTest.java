package chapternine;

import general.TestShopScenario;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class FillinContactFormTest extends TestShopScenario {

    @Test
    public void contactForm(){

        // Go to contact page from homepage
        HomePage homePage = new HomePage(driver);
        homePage.goToContactPage();

        // Fill in the contact form
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.fillInContactForm("bootcamper@feelthepain.com", "4321234", "Ipod defect while lifting, need new one");
        contactUsPage.sendContactForm();

        // Check if the message has been sent
        contactUsPage.messageSentSuccesfull();
    }

}
