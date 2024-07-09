package co.com.choucair.certification.SAUCEDEMO.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Validate implements Question<String> {

    Target txtValidation2;

    public Validate(Target txtValidation2) {
        this.txtValidation2 = txtValidation2;
    }

    public static Validate text(Target txtValidation2) {
        return Instrumented.instanceOf(Validate.class).withProperties(txtValidation2);
    }

    @Override
    public String answeredBy(Actor actor) {
        return txtValidation2.resolveFor(actor).getText();
    }
}
