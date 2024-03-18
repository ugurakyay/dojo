package Tests;


import PageObjects.LoginPageObject;
import framework.BaseWebAutomationTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Set;


import static framework.utils.WebDriverUtils.browser;

public class LoginPageTest extends BaseWebAutomationTest {
    private LoginPageObject login;

    @BeforeMethod
    public void setUp() {
        login = new LoginPageObject();
    }

    @Test(description = "Test login functionality")
    public void testLogin() throws InterruptedException {
        login.navigateTo();
        Thread.sleep(10000);
        login.Loginpage();
        login.LogOut();
    }

    @AfterMethod
    public void tearDown() {
        // Tüm tarayıcı pencerelerini al
        Set<String> windowHandles = browser().getWindowHandles();

        // Her bir pencere için işlem yap
        for (String windowHandle : windowHandles) {
            try {
                // Belirli bir pencereye geçiş yap ve kapat
                browser().switchTo().window(windowHandle);
                browser().close();
            } catch (Exception e) {
                // Hata durumunda bir şey yapma
            }
        }

        // Tarayıcı oturumunu sonlandır
        browser().quit();
    }

    @Override
    public void navigateTo() {
        // Uygulanacak kodu buraya ekleyin
    }

    @Override
    public boolean isPresent() {
        return false;
    }
}
