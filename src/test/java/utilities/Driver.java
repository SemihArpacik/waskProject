package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


import java.time.Duration;

public class Driver {


    private Driver() {

    }

    static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            switch (ConfigReader.getProperty("browser")) {

                case "chrome":
                    ChromeOptions options = new ChromeOptions();

//                    options.addArguments("--incognito");
//                    options.addArguments("--start-maximized");
//                    options.addArguments("--ignore-certificate-errors");
//                    options.addArguments("--allow-insecure-localhost");
//                    options.addArguments("--acceptInsecureCerts");
//                    options.addArguments("--disable-popup-blocking");
                    options.addArguments("--disable-blink-features=AutomationControlled");
//                    options.addArguments("--disable-extensions");

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(options);
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case " headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
        }

        WebDriverManager.chromedriver().setup();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;


    }


    public static void CloseDriver() {

        if (driver != null) {

            driver.quit();
            driver = null;

        }

    }
}
