package Utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    public static String browserName = "";

    public void onTestStart(ITestResult result) {
        WebDriverManager.openBrowser(browserName);
    }

    public void onTestSuccess(ITestResult result) {
        WebDriverManager.closeBrowser();
    }

    public void onTestFailure(ITestResult result) {
    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {
        browserName = context.getCurrentXmlTest().getParameter("browserName");
    }

    public void onFinish(ITestContext context) {
    }
}