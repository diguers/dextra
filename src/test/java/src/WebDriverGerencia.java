package src;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverGerencia {

    private WebDriver driver;

    public WebDriver createWebDriver(DriverManagerType driverManagerType) {
        switch (driverManagerType) {
            case CHROME:
                return this.chromeDriver();
            default:
                return this.chromeDriver();
        }
    }



    private WebDriver chromeDriver() {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();

        return driver;
    }
}

