package co.com.choucair.certification.SAUCEDEMO.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Buy implements Question<String> {

    Target buy;

    public Buy(Target buy) {
        this.buy = buy;
    }

    public static Buy products(Target buy) {
        return Instrumented.instanceOf(Buy.class).withProperties(buy);
    }

    @Override
    public String answeredBy(Actor actor) {
        return buy.resolveFor(actor).getText();
    }
}
