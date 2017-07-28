package examples;

import general.TestShopScenario;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.xml.bind.Element;

/**
 * Created by Selenium on 19-7-2017.
 */
public class FirstSeleniumTest extends TestShopScenario {

    @Test
    public void logInSuccesFull(){

        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("tester@test.com");
        driver.findElement(By.id("passwd")).sendKeys("1qazxsw2");
        driver.findElement(By.id("SubmitLogin")).click();

        String validation = driver.findElement(By.className("page-heading")).getText();
        Assertions.assertThat(validation).as("My account not present").isEqualTo("MY ACCOUNT");

    }
}
