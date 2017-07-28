package chaptersix;

import general.TestShopScenario;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class AdjustPersonalInfoTest extends TestShopScenario {

    @Test
    public void editPersonalInfo(){

        String firstName = "Wout";
        String firstName2 = "Piet";

        // Go to login page.
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();

        // Enter credentials to login.
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCredentials("wout@dejong.com", "1qazxsw2");

        // Go to personal info from login page
        AccountPage accountPage = new AccountPage(driver);
        accountPage.goToPersonalInfo();

        String nameValidation = driver.findElement(By.xpath(".//*[@id='firstname']")).getText();

        if (nameValidation.contentEquals(firstName)){
            accountPage.enterFirstName(firstName2);
        } else if (nameValidation.contentEquals(firstName2)){
            accountPage.enterFirstName(firstName);
        } else {
            accountPage.enterFirstName(firstName);
        }


    }
}
