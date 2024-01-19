package org.example.bridglabzeTest;

import org.example.pages.HomePage;
import org.example.pages.SignupPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.example.base.TestBase;
public class SignupPageTest extends TestBase {
    SignupPage signupPage;
    HomePage homePage;
    public SignupPageTest(){
        super();
    }
    @BeforeMethod()
    public void setup(){
        initialization();
        signupPage=new SignupPage();
    }
    @Test(priority = 1)
    public void setSignupPage(){
        homePage=signupPage.sigPage(props.getProperty("firstName"),props.getProperty("surname"),props.getProperty("mobileNumber"),props.getProperty("newPassword"),props.getProperty("day"),props.getProperty("month"),props.getProperty("year"));
    }
//    @AfterMethod
//    public void quitMethod(){
//        driver.quit();
//    }
}
