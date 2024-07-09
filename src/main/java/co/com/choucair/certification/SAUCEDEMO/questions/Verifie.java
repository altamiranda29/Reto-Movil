package co.com.choucair.certification.SAUCEDEMO.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Verifie implements Question<String> {

    Target product;

    public Verifie(Target product) {
        this.product = product;
    }

    public static Verifie car(Target product) {
        return Instrumented.instanceOf(Verifie.class).withProperties(product);
    }

    @Override
    public String answeredBy(Actor actor) {
        return product.resolveFor(actor).getText();
    }
}
