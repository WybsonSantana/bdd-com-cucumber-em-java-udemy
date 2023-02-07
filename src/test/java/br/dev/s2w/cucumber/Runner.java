package br.dev.s2w.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/br/dev/s2w/cucumber/aprender_cucumber.feature",
        plugin = "pretty",
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        strict = false,
        tags = {"@Unitários", "not @NegarStepsAnteriores"}
)
public class Runner {
}
