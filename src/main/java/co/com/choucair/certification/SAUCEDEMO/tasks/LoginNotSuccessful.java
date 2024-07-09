package co.com.choucair.certification.SAUCEDEMO.tasks;

import co.com.choucair.certification.SAUCEDEMO.model.LoginData;
import co.com.choucair.certification.SAUCEDEMO.userinterfaces.SerenityLoginPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginNotSuccessful implements Task {

    LoginData loginData;

    public LoginNotSuccessful(LoginData loginData) {
        this.loginData = loginData;
    }

    public static LoginNotSuccessful page(LoginData loginData) {
        return Instrumented.instanceOf(LoginNotSuccessful.class).withProperties(loginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(loginData.getEmail()).into(SerenityLoginPage.EMAIL),
                Enter.theValue(loginData.getIncorrectPassword()).into(SerenityLoginPage.PASSWORD),
                Click.on(SerenityLoginPage.BUTTON_LOGIN)
        );
    }
}
