package PageObjects;

import Actions.PreDefinedActions;
import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BaseClass {


    public ProfilePage()//create a constructor
    {
        PageFactory.initElements(driver, this);//initializing the driver and web-elements
    }


    @FindBy(xpath="//button[text()='Existing user? Login']")
    private WebElement ExistingUserLogin;

    @FindBy(xpath="//button[text()='Login with email']")
    private WebElement LoginWithEmail;

    @FindBy(xpath="//input[@type='email']")
    private WebElement EmailAddress;

    @FindBy(xpath="//button[text()='Continue']")
    private WebElement Continue1;


    @FindBy(xpath = "//input[@placeholder='Enter First Name']")
    private WebElement FirstName;


    @FindBy(xpath = "//input[@placeholder='Enter Last Name']")
    private WebElement LastName;

    @FindBy(xpath = "//input[@placeholder='Enter PIN code']")
    private WebElement PinCode;

    @FindBy(xpath= "//button[@type='submit']")
    private WebElement Continue;

    @FindBy(id="otpInput")
    private WebElement OTP;

    @FindBy(xpath="//button[text()='Continue']")
    private WebElement Continue3;

    @FindBy(xpath="//button[text()='Continue']")
    private WebElement Continue4;

    public void setLogin(String emailAddress, String firstName, String lastName, String pinCode) throws InterruptedException {
      PreDefinedActions.clickMethod(ExistingUserLogin, true );
        PreDefinedActions.clickMethod(LoginWithEmail, true);
        PreDefinedActions.clickMethod(EmailAddress, true);
        PreDefinedActions.sendKeysMethod(EmailAddress, emailAddress);
        PreDefinedActions.clickMethod(Continue1, true);
        // Wait for OTP input (Pause the script to allow manual entry of OTP)
        Thread.sleep(30000); // Pauses execution for 30 seconds to give you time to enter OTP manually
        PreDefinedActions.clickMethod(Continue3, true);

        Thread.sleep(50000);

        PreDefinedActions.clickMethod(FirstName, true);
        PreDefinedActions.sendKeysMethod(FirstName, firstName);

        PreDefinedActions.clickMethod(LastName, true);
        PreDefinedActions.sendKeysMethod(LastName, lastName);

        PreDefinedActions.clickMethod(PinCode, true);
        PreDefinedActions.sendKeysMethod(PinCode, pinCode);

        PreDefinedActions.clickMethod(Continue, true);
        PreDefinedActions.clickMethod(Continue4, true);


    }
}






