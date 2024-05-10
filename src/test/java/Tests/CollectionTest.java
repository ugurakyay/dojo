package Tests;

import PageObjects.CollectionsPageObject;
import PageObjects.LoginPageObject;
import PageObjects.StoryDetailPageObject;
import PageObjects.StoryPageObject;
import framework.BaseWebAutomationTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CollectionTest extends BaseWebAutomationTest {
    private LoginPageObject login;
    private CollectionsPageObject collection;

    @BeforeMethod
    public void setUp() {
        login = new LoginPageObject();
        collection = new CollectionsPageObject();
    }

    @Test(description = "Test Collection functionality")
    public void addCollection () throws InterruptedException {
        login.navigateTo();
        login.login();
        collection.addCollection();
        collection.sortCollectionNewst();
        collection.sortCollectionOldest();
        collection.sortCollectionA_Z();
        collection.sortCollectionZ_A();
        collection.removeCollection();
        login.logOut();
    }

    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }
}
