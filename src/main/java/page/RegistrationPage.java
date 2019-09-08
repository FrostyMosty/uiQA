package page;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class RegistrationPage {

    By lastName = By.xpath("//*[@id=\"lastName\"]");
    By firstName = By.xpath("//*[@id=\"name\"]");
    By telephoneNumber = By.xpath("//*[@id=\"phone\"]");
    By mail = By.xpath("//*[@id=\"email\"]");
    By buttonRegistration = By.xpath("//*[@id=\"tryReg\"]/span");

    public void sendLastName(String text){
        Selenide.$(lastName).setValue(text);
    }

    public void sendFirstName(String text){
        Selenide.$(firstName).setValue(text);
    }


    public void sendTelephoneNumber(String text){
        Selenide.$(telephoneNumber).setValue(text);
    }

    public void sendMail(String text){
        Selenide.$(mail).setValue(text);
    }


    public void clickButton(){
        Selenide.$(buttonRegistration).click();
    }
    // Exit
}

