package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class WebDriverManager {

    public static WebDriver driver;

    public static void openBrowser(String browser) {

        if (browser.equalsIgnoreCase("firefox")) {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("mac")){
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
            } else if (os.contains("linux")) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
            } else {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\geckodriver.exe");
            }
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }

    public static void closeBrowser() {
        driver.quit();
    }

}