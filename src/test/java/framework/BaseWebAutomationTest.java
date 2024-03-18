package framework;

import framework.utils.WebDriverUtils;
import org.testng.annotations.AfterMethod;


public abstract class BaseWebAutomationTest {



    @AfterMethod

   public void tearDown() {



        WebDriverUtils.shutDown();

    }


    public abstract void navigateTo();

    public abstract boolean isPresent();
}









