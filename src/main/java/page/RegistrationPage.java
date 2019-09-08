package page;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class RegistrationPage {

    By lastName = By.xpath("//*[@id=\"lastName\"]");
    By firstName = By.xpath("//*[@id=\"name\"]");
    By telephoneNumber = By.xpath("//*[@id=\"phone\"]");
    By mail = By.xpath("//*[@id=\"email\"]");
    By buttonRegistration = By.xpath("//*[@id=\"tryReg\"]/span");

    public void validLastName(){
        Selenide.$(lastName).setValue("Иванов");
    }

    public void invalidLastName(){
        Selenide.$(lastName).setValue("123%^");
    }

    public void validFirstName(){
        Selenide.$(firstName).setValue("Иван");
    }

    public void invalidFirstName(){
        Selenide.$(firstName).setValue("092&^%");
    }

    public void validTelephoneNumber(){
        Selenide.$(telephoneNumber).setValue("9991234567");
    }

    public void invalidTelephoneNumber() {
        Selenide.$(telephoneNumber).setValue("99912345");
    }

    public void validMail(){
        Selenide.$(mail).setValue("abc@gmail.com");
    }

    public void invalidMail(){
        Selenide.$(mail).setValue("abc@@gmail.com");
    }

    public void clickButton(){
        Selenide.$(buttonRegistration).click();
    }
}
