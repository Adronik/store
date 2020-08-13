import Pages.Authentication;
import Pages.Home;
import Pages.MyAccount;
import Utils.SiteNavigation;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class LogoutTests {

    @Test
    public void logoutUI() {
        Authentication authentication = SiteNavigation.openHomePage().clickOnSignIn();
        authentication.enterEmail();
        authentication.enterPassword();
        MyAccount myAccount = authentication.clickSignInButton();
        myAccount.clickOnSignOut();
        assertTrue(authentication.userIsOnAuthenticationPage());
    }

    @Test
    public void logoutByURL() {
        Home homePage = new Home();
        Authentication authentication = SiteNavigation.openHomePage().clickOnSignIn();
        authentication.enterEmail();
        authentication.enterPassword();
        authentication.clickSignInButton();
        SiteNavigation.logoutURL();
        assertTrue(homePage.userIsOnHomePage());
    }

}