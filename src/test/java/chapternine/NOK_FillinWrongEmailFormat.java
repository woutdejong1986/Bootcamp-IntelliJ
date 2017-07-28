package chapternine;

import general.TestShopScenario;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class NOK_FillinWrongEmailFormat extends TestShopScenario {

    @Test
    public void retryAfterFailure(){

        // Go to login page
        HomePage homePage = new HomePage(driver);
        homePage.goToContactPage();

        // Fill in wrong email format and assert that it's not accepted.
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.fillInContactForm("nope", "", "");
        contactUsPage.formatNotOK();

        // Fill in correct email format and assert that it's accepted
        contactUsPage.fillInContactForm("nope@correct.com", "", "");
        contactUsPage.formatOK();
    }
}
