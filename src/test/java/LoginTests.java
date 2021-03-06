import Pages.Authentication;
import Pages.Home;
import Pages.MyAccount;
import Utils.SiteNavigation;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class LoginTests {

    @Test
    public void login_HappyPath() {
        Authentication authentication = SiteNavigation.openHomePage().clickOnSignIn();
        authentication.enterEmail();
        authentication.enterPassword();
        MyAccount myAccount = authentication.clickSignInButton();
        assertTrue(myAccount.myWishListIsDisplayed());
    }

}