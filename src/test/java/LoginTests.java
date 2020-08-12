import Pages.Authentication;
import Pages.MyAccount;
import Utils.SiteNavigation;
import org.testng.annotations.Test;

public class LoginTests {

    @Test
    public void login_HappyPath() {
        Authentication authentication = SiteNavigation.openHomePage().clickOnSignIn();
        authentication.enterEmail();
        authentication.enterPassword();
        authentication.clickSignInButton();
    }

}
