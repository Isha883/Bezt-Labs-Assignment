package test.java.TestScripts;
import Base.BaseClass;
import PageObjects.ProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTestVerify extends BaseClass {
    ProfilePage page;

    @Test(description = "Let's test simple test case")
    public void TC_0001() throws InterruptedException {
        page = new ProfilePage();
        page.setLogin("ishakeshri330@gmail.com", "Isha", "Keshri", "273155");
    }
}


