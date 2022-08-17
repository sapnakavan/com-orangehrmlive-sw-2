package testsuite;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl ="https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);

    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //* click on the ‘Forgot your password’ link
        //driver.findElement(By.xpath(" //div[@id='forgotPasswordLink']")).click();
     WebElement forgotpassword = driver.findElement(By.xpath(" //div[@id='forgotPasswordLink']"));
     forgotpassword.click();


        //* Verify the text ‘Forgot Your Password?’
        WebElement verify = driver.findElement(By.linkText("Forgot your password?"));
        String actualmess = verify.getText();

        String expectedmess = "Forgot your password?";

        Assert.assertEquals(expectedmess,actualmess);

    }
    @After
    public void teardown(){
        closeBrowser();
    }

}
