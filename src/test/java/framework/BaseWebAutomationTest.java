package framework;

import com.aventstack.extentreports.ExtentReports;
import framework.utils.WebDriverUtils;
import org.testng.annotations.AfterMethod;


public abstract class BaseWebAutomationTest {
    protected static ExtentReports extent;



    @AfterMethod
    public void tearDown() {
        WebDriverUtils.getBrowser().quit();
    }


    public abstract void navigateTo();

    public abstract boolean isPresent();
}
