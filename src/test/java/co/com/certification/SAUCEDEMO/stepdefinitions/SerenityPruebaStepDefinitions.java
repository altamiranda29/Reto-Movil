package co.com.certification.SAUCEDEMO.stepdefinitions;

import co.com.choucair.certification.SAUCEDEMO.model.LoginData;
import co.com.choucair.certification.SAUCEDEMO.model.PaymentDetailsData;
import co.com.choucair.certification.SAUCEDEMO.questions.Buy;
import co.com.choucair.certification.SAUCEDEMO.questions.Validate;
import co.com.choucair.certification.SAUCEDEMO.questions.ValidateText;
import co.com.choucair.certification.SAUCEDEMO.questions.Verifie;
import co.com.choucair.certification.SAUCEDEMO.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.choucair.certification.SAUCEDEMO.userinterfaces.SerenityAddProductsCar.PRODUCT_1;
import static co.com.choucair.certification.SAUCEDEMO.userinterfaces.SerenityBuyProducts.TEXT_BUY;
import static co.com.choucair.certification.SAUCEDEMO.userinterfaces.SerenityLoginPage.TXT_VALIDATION;
import static co.com.choucair.certification.SAUCEDEMO.userinterfaces.SerenityLoginPage.TXT_VALIDATION2;
import static co.com.choucair.certification.SAUCEDEMO.util.Data.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class SerenityPruebaStepDefinitions {

    @Given("que estoy en la página de inicio de sesión")
    public void queEstoyEnLaPáginaDeInicioDeSesión() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }

    @When("ingreso mi nombre de usuario y contraseña")
    public void ingresoMiNombreDeUsuarioYContraseña(DataTable dataTable) {
        OnStage.theActorCalled(ACTOR).attemptsTo(Login.page(LoginData.setData(dataTable).get(0)));
    }

    @Then("debería ver la página de selección de productos (.*)$")
    public void deberíaVerLaPáginaDeSelecciónDeProductosmessage(String text) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateText.of(TXT_VALIDATION), containsString(text)));
    }

    @When("ingreso mi nombre de usuario y contraseña incorrecta")
    public void ingresoMiNombreDeUsuarioYContraseñaIncorrecta(DataTable dataTable) {
        OnStage.theActorCalled(ACTOR).attemptsTo(LoginNotSuccessful.page(LoginData.setData(dataTable).get(0)));
    }

    @Then("debería ver un mensaje de error indicando credenciales incorrectas (.*)$")
    public void deberíaVerUnMensajeDeErrorIndicandoCredencialesIncorrectasMessage(String text) {
        OnStage.theActorInTheSpotlight().should(seeThat(Validate.text(TXT_VALIDATION2), containsString(text)));
    }

    @When("ingreso mi nombre de usuario y contraseña correctas")
    public void ingresoMiNombreDeUsuarioYContraseñaCorrectas(DataTable dataTable) {
        OnStage.theActorCalled(ACTOR).attemptsTo(Login.page(LoginData.setData(dataTable).get(0)));
    }

    @And("agrego productos al carrito")
    public void agregoProductosAlCarrito() {
        OnStage.theActorCalled(ACTOR).attemptsTo(Add.products());
    }

    @Then("deberia ver los productos agregados en el carrito (.*)$")
    public void deberiaVerLosProductosAgregadosEnElCarritoProduct1(String text) {
        OnStage.theActorInTheSpotlight().should(seeThat(Verifie.car(PRODUCT_1), containsString(text)));
    }
    @And("ingreso mi nombre de usuario y contraseña de logueo")
    public void ingresoMiNombreDeUsuarioYContraseñaDeLogueo(DataTable dataTable) {
        OnStage.theActorCalled(ACTOR).attemptsTo(Login.page(LoginData.setData(dataTable).get(0)));
    }

    @And("agrego algunos productos al carrito")
    public void agregoAlgunosProductosAlCarrito() {
        OnStage.theActorCalled(ACTOR).attemptsTo(Add.products());
    }

    @When("miro el carrito de productos")
    public void miroElCarritoDeProductos() {
        OnStage.theActorCalled(ACTOR).attemptsTo(Go.toCart());
    }

    @And("realizo el proceso de pago")
    public void realizoElProcesoDePago(DataTable dataTable) {
        OnStage.theActorCalled(ACTOR).attemptsTo(Make.aPurchase(PaymentDetailsData.setData(dataTable).get(0)));
    }

    @Then("deberia ver el mensaje de (.*)$")
    public void deberiaVerElMensajeDe(String text) {
        OnStage.theActorInTheSpotlight().should(seeThat(Buy.products(TEXT_BUY), containsString(text)));
    }
}
