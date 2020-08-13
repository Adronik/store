package Utils;

import Pages.Home;

public class SiteNavigation {

    public static Home openHomePage() {
        WebDriverManager.driver.get("http://automationpractice.com/index.php");
        return new Home();
    }

    public static void logoutURL() {
        WebDriverManager.driver.get("http://automationpractice.com/index.php?mylogout=");
    }

}