import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.RegistrationPage;

import static com.codeborne.selenide.Selenide.open;

public class UITest {

    @BeforeMethod
    public void settings(){

        Configuration.browser = "chrome";
    }

    @Test
    public void test(){
        open("https://gorzdrav.spb.ru/");
        Selenide.$(By.xpath("//*[@id=\"header\"]/ul/li[2]/a")).click();

        LoginPage loginPage = new LoginPage();

        loginPage.inputLogin();
        loginPage.inputPassword();
        loginPage.clickButton();

        String x = Selenide.$(By.xpath("//*[@id=\"authnFrm\"]/div[1]/div[3]/dl[1]/dd/div/div/span")).getText();

        MatcherAssert.assertThat("Введите мобильный телефон или почту", Matchers.equalTo(x));




    }

    @Test
    public void testWithValidValues(){
        Selenide.open("https://esia.gosuslugi.ru/registration/");

        RegistrationPage registrationPage = new RegistrationPage();

        registrationPage.validLastName();
        registrationPage.validFirstName();
        registrationPage.validTelephoneNumber();
        registrationPage.validMail();

    }

    @Test
    public void testWithInvalidFirstName(){
        Selenide.open("https://esia.gosuslugi.ru/registration/");

        RegistrationPage registrationPage = new RegistrationPage();

        registrationPage.invalidLastName();
        registrationPage.validFirstName();
        registrationPage.validTelephoneNumber();
        registrationPage.validMail();
        registrationPage.clickButton();

        String error = Selenide.$(By.xpath("//*[@id=\"lastName\"]")).getText();

    }



}
