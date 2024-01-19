package org.example.bridglabzeTest;
import org.example.base.TestBase;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    public LoginPageTest(){
        super();
    }
    @BeforeMethod()
    public void setup(){
        initialization();
         loginPage=new LoginPage();
    }
    @Test(priority = 1)
    public void setLoginPage(){
        loginPage.loginPage(props.getProperty("email"),props.getProperty("password"));
    }
//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }
}
