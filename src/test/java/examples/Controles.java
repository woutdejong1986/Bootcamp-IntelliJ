package examples;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

/**
 * Created by Selenium on 19-7-2017.
 */
public class Controles {

    @Test
    public int assertNumbers() {

        int sum = 3 * 5;
        Assertions.assertThat(sum).isGreaterThan(10);

        return (assertNumbers());
    }
}
