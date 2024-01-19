package org.example.pages;

import org.example.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage extends TestBase {
    @FindBy(linkText = "Create new account")
    WebElement signUp;
    @FindBy(name="firstname")
    WebElement firstName;
    @FindBy(name="lastname")
    WebElement surname;
    @FindBy(name="reg_email__")
    WebElement mobileNumber;
    @FindBy(name="reg_passwd__")
    WebElement newPassword;
    @FindBy(name="birthday_day")
    WebElement day;
    @FindBy(name="birthday_month")
    WebElement month;
    @FindBy(name="birthday_year")
    WebElement year;
    @FindBy(xpath="//label[text()='Male']")
    WebElement gender;
    @FindBy(xpath = "//div//button[@name='websubmit']")
    WebElement signup;

    public SignupPage(){
        PageFactory.initElements(driver,this);
    }

    public HomePage sigPage(String fn,String surName,String mobile,String pass,String day1,String month1,String year1){
        signUp.click();
        firstName.sendKeys("Kuldeep");
        surname.sendKeys("Soni");
        mobileNumber.sendKeys("6386039833");
        newPassword.sendKeys("Admin@12345");
        day.sendKeys("3");
        month.sendKeys("January");
        year.sendKeys("1997");
        gender.click();
        signup.click();
        return new HomePage();
    }

}
