package Tests;

import PageObjects.LibraryPageObject;
import PageObjects.LoginPageObject;
import framework.BaseWebAutomationTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class LoginPageTest extends BaseWebAutomationTest {
    private LoginPageObject login;
    private ChromeDriverService service;


    @BeforeMethod
    public void setUp() {
        login = new LoginPageObject();

    }
    @Test(description = "Test login functionality")
    public void testLogin() throws InterruptedException {
        login.navigateTo();
        login.login();
        login.logOut();
    }

    @Override
    public void navigateTo() {
        // Uygulanacak kodu buraya ekleyin
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    // Test tamamlandığında ChromeDriver hizmetini durdurun
    public void tearDown() {
        service.stop();
    }
}
