package co.com.choucair.certification.SAUCEDEMO.tasks;

import co.com.choucair.certification.SAUCEDEMO.userinterfaces.SerenityAddProductsCar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Add implements Task {

    public static Add products() {
        return Tasks.instrumented(Add.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SerenityAddProductsCar.PRODUCT1),
                Click.on(SerenityAddProductsCar.ADD_TO_CART),
                Click.on(SerenityAddProductsCar.BACK_TO_PRODUCTS),
                Click.on(SerenityAddProductsCar.PRODUCT2),
                Click.on(SerenityAddProductsCar.ADD_TO_CART),
                Click.on(SerenityAddProductsCar.BACK_TO_PRODUCTS),
                Click.on(SerenityAddProductsCar.PRODUCT3),
                Click.on(SerenityAddProductsCar.ADD_TO_CART),
                Click.on(SerenityAddProductsCar.BACK_TO_PRODUCTS),
                Click.on(SerenityAddProductsCar.SHOPPING_CART_LINK)
        );
    }
}
