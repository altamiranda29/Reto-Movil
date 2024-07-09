package co.com.choucair.certification.SAUCEDEMO.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityLoginPage {

    public static final Target EMAIL = Target.the("EMAIL")
            .located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("password")
            .located(By.id("password"));
    public static final Target BUTTON_LOGIN = Target.the("login")
            .located(By.id("login-button"));
    public static final Target TXT_VALIDATION = Target.the("TXT_VALIDATION")
            .located(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
    public static final Target TXT_VALIDATION2 = Target.the("TXT_VALIDATION2")
            .located(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));


}
