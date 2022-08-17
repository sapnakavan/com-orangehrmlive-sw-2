package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl ="https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        // * Enter “Admin” username
        // driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");

        //* Enter “admin123 password
        // driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
        WebElement password= driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("admin123");


        //* Click on ‘LOGIN’ button
        // driver.findElement(By.xpath("//input[@class='button']")).click();
        WebElement login= driver.findElement(By.xpath(" //input[@class='button']"));
        login.click();



        //  * Verify the ‘Welcome’ text is display
        WebElement verify = driver.findElement(By.linkText("Welcome Paul"));
        String actualmess = verify.getText();

        String expectedmess = "Welcome Paul";

        Assert.assertEquals(expectedmess,actualmess);
    }
    @After
    public void teardown(){
        closeBrowser();
    }
}
