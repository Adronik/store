package Utils;

import Pages.Authentication;
import Pages.Home;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SiteNavigation {

    public static Home openHomePage() {
        WebDriverManager.driver.get("http://automationpractice.com/index.php");
        return new Home();
    }

    public static void logoutURL() {
        WebDriverManager.driver.get("http://automationpractice.com/index.php?mylogout=");
    }

}