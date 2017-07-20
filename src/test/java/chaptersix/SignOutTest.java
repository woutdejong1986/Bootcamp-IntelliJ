package chaptersix;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.xml.bind.Element;

/**
 * Created by Selenium on 20-7-2017.
 */
public class SignOutTest {

    @Test
    public void SignOutTest(){

        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://techblog.polteq.com/testshop/index.php");

        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("tester@test.com");
        driver.findElement(By.id("passwd")).sendKeys("1qazxsw2");
        driver.findElement(By.id("SubmitLogin")).click();

        String loginvalidation = driver.findElement(By.className("page-heading")).getText();
        Assertions.assertThat(loginvalidation).as("My account not present").isEqualTo("MY ACCOUNT");

        Assertions.assertThat(driver.findElement(By.className("logout")).isDisplayed());

        driver.findElement(By.className("logout")).click();

        String logoutvalidation = driver.findElement(By.className("page-heading")).getText();
        Assertions.assertThat(logoutvalidation).as("Authentication not present").isEqualTo("AUTHENTICATION");

        driver.quit();
}

}
