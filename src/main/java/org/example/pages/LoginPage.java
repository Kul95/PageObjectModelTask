package org.example.pages;

//import jdk.jfr.Name;
import org.example.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    @FindBy(name="email")
    WebElement email;
    @FindBy(name="pass")
    WebElement password;
    @FindBy(name="login")
    WebElement loginBtn;

    //Initializing page object
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    //Actions
    public String validateLoginPage(){
        return driver.getTitle();
    }

    public String validatePassword(){
        return driver.getTitle();
    }
    public HomePage loginPage(String em,String pass){
        email.sendKeys(em);
        password.sendKeys(pass);
        loginBtn.click();
        return new HomePage();
    }
}
