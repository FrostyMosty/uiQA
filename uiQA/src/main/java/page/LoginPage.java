package page;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class LoginPage {

    By login = By.xpath("//*[@id=\"mobileOrEmail\"]");
    By password = By.xpath("//*[@id=\"password\"]");
    By buttonEnter = By.xpath("//*[@id=\"loginByPwdButton\"]/span");

    public void inputLogin(){
        Selenide.$(login).setValue("111");
    }

    public void inputPassword(){
        Selenide.$(password).setValue("111");
    }

    public void clickButton(){
        Selenide.$(buttonEnter).click();

    }




}
