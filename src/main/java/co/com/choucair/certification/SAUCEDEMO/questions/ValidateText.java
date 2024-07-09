package co.com.choucair.certification.SAUCEDEMO.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.Question;

public class ValidateText implements Question<String>{

    Target txtValidation;

    public ValidateText(Target txtValidation) {
        this.txtValidation = txtValidation;
    }

    public static ValidateText of(Target txtValidation) {
        return Instrumented.instanceOf(ValidateText.class).withProperties(txtValidation);
    }

    @Override
    public String answeredBy(Actor actor) {
        return txtValidation.resolveFor(actor).getText();
    }
}
