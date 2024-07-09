package co.com.choucair.certification.SAUCEDEMO.tasks;

import co.com.choucair.certification.SAUCEDEMO.model.PaymentDetailsData;
import co.com.choucair.certification.SAUCEDEMO.userinterfaces.SerenityBuyProducts;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Make implements Task {

    PaymentDetailsData paymentDetailsData;

    public Make(PaymentDetailsData paymentDetailsData) {
        this.paymentDetailsData = paymentDetailsData;
    }

    public static Make aPurchase(PaymentDetailsData paymentDetailsData) {
        return Instrumented.instanceOf(Make.class).withProperties(paymentDetailsData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SerenityBuyProducts.BUTTON_CHECKOUT),
                Enter.theValue(paymentDetailsData.getFirstName()).into(SerenityBuyProducts.FIRST_NAME),
                Enter.theValue(paymentDetailsData.getLastName()).into(SerenityBuyProducts.LAST_NAME),
                Enter.theValue(paymentDetailsData.getPostCode()).into(SerenityBuyProducts.POST_CODE),
                Click.on(SerenityBuyProducts.BUTTON_CONTINUE),
                Click.on(SerenityBuyProducts.BUTTON_FINISH)
        );
    }
}
