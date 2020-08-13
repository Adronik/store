import Pages.Authentication;
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

}
