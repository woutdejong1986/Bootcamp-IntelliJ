package chapternine;

import general.TestShopScenario;
import org.testng.annotations.Test;
import pages.HomePage;

public class CreateWishList extends TestShopScenario {

    @Test
    public void createWishList(){

        // Go to wishlist page from homepage
        HomePage homePage = new HomePage(driver);
        homePage.goToWishlistPage();

//        if (//check of element er is){
//            //log in
//        }

        //verder met de test

    }
}
