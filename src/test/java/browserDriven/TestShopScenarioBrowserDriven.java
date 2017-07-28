package browserDriven;


import Browser.BrowserFactoryAdvanced;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestShopScenarioBrowserDriven {

    protected WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(BrowserFactoryAdvanced.BrowserOptions browserOptions) {
        driver = BrowserFactoryAdvanced.chooseBrowserOption(browserOptions);
//        driver.manage().window().setSize(new Dimension(1366, 768));
//        driver.manage().window().maximize();

        // Open the website
        driver.get("https://techblog.polteq.com/testshop/index.php");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
