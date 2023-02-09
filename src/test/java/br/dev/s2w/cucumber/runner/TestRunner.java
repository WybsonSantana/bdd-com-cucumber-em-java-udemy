package br.dev.s2w.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/aprender_cucumber.feature",
        glue = "br/dev/s2w/cucumber/stepdefs",
        plugin = "pretty",
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        strict = false,
        tags = {"@Unitários", "not @NegarStepsAnteriores"}
)
public class TestRunner {
}
