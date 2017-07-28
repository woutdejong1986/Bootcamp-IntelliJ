package homework;

import general.TestShopScenario;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.WishListPage;

import java.util.List;


public class DeleteWishListTest extends TestShopScenario {

    @Test
    public void deleteWishList(){

        // Go go login page from home page.
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();

        // On the login page, enter the credentials.
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCredentials("wout@dejong.com", "1qazxsw2");

        // On the account page, naviate to 'wishlist'.
        AccountPage accountPage = new AccountPage(driver);
        accountPage.goToWishList();

        // Get content of the table on the wishlist page.
        WishListPage wishListPage = new WishListPage(driver);
        wishListPage.getTableContent();

        // Delete 'Feel the pain' wishlist, handle the alert.
        wishListPage.deleteWishList();
        wishListPage.checkAlert();

//        // Check if wishlist is not present.
//        wishListPage.assertWishlistGone();

        // Add wishlist again.
        wishListPage.addWishlist("Feel the pain");

    }

}
