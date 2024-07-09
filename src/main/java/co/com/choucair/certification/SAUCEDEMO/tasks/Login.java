package co.com.choucair.certification.SAUCEDEMO.tasks;

import co.com.choucair.certification.SAUCEDEMO.model.LoginData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import co.com.choucair.certification.SAUCEDEMO.userinterfaces.SerenityLoginPage;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    LoginData loginData;

    public Login(LoginData loginData) {
        this.loginData = loginData;
    }

    public static Login page(LoginData loginData) {
        return Instrumented.instanceOf(Login.class).withProperties(loginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(loginData.getEmail()).into(SerenityLoginPage.EMAIL),
                Enter.theValue(loginData.getPassword()).into(SerenityLoginPage.PASSWORD),
                Click.on(SerenityLoginPage.BUTTON_LOGIN)
        );
    }
}
