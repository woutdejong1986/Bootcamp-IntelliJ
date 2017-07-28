package Browser;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactoryMedior {
    public static WebDriver getDriver(String browser){

        switch (browser.toLowerCase()) {
            case "firefox":
                return createFirefoxDriver();
            case "ie":
                return createIEDriver();
            case "chrome":
                return createChromeDriver();
            default:
                return createChromeDriver();
        }
    }

    private static WebDriver createFirefoxDriver(){
        FirefoxDriverManager.getInstance().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    private static WebDriver createChromeDriver(){
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized--");
        options.addArguments("ignore-certificate-errors");
        capabilities.setCapability("chrome.switches", "--verbose");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        ChromeDriverManager.getInstance().setup();
        return new ChromeDriver(capabilities);
    }

    private static WebDriver createIEDriver(){
        InternetExplorerDriverManager.getInstance().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }
}
