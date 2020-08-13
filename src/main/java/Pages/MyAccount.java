package Pages;

import Utils.BasePage;
import Utils.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccount extends BasePage {

    @FindBy(xpath = "//a[@class='logout']")
    private WebElement signOut;

    @FindBy(xpath = "//a[@title=\"My wishlists\"]")
    private WebElement myWishListsLink;


    public Authentication clickOnSignOut() {
        WebDriverWait wait = new WebDriverWait(WebDriverManager.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='logout']")));
        signOut.click();
        return new Authentication();
    }

    public boolean myWishListIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(WebDriverManager.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"My wishlists\"]")));
        return myWishListsLink.isDisplayed();
    }

}