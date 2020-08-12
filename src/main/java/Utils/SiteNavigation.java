package Utils;

import Pages.Home;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SiteNavigation {

    public static Home openHomePage() {
        WebDriverManager.driver.get("http://automationpractice.com/index.php");
        WebDriverWait wait = new WebDriverWait(WebDriverManager.driver, 5);
        return new Home();
    }

}
