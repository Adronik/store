package Pages;
import Utils.BasePage;
import Utils.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Home extends BasePage {

    @FindBy(xpath = "//a[@class='login']")
    private WebElement signIn;

    public Authentication clickOnSignIn() {
        WebDriverWait wait = new WebDriverWait(WebDriverManager.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='login']")));
        signIn.click();
        return new Authentication();
    }

}