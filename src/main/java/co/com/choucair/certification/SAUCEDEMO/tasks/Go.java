package co.com.choucair.certification.SAUCEDEMO.tasks;

import co.com.choucair.certification.SAUCEDEMO.userinterfaces.SerenityAddProductsCar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Go implements Task {
    public static Go toCart() {
        return Tasks.instrumented(Go.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SerenityAddProductsCar.SHOPPING_CART_LINK)
        );
    }
}
