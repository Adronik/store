package Pages;

import Utils.BasePage;
import Utils.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Authentication extends BasePage {

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    public Authentication enterEmail() {
        WebDriverWait wait = new WebDriverWait(WebDriverManager.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        emailField.sendKeys("pustovoyalexander+auto@gmail.com");
        return new Authentication();
    }

    public Authentication enterPassword() {
        WebDriverWait wait = new WebDriverWait(WebDriverManager.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));
        passwordField.sendKeys("Password123");
        return new Authentication();
    }

    public MyAccount clickSignInButton() {
        signInButton.click();
        return new MyAccount();
    }

}
