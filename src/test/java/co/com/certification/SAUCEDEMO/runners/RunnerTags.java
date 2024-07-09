package co.com.certification.SAUCEDEMO.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueba.feature",
        glue = "co.com.certification.SAUCEDEMO.stepdefinitions",
        tags = "@HU",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTags {
}