package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber_rapor.html"},
        features="src/test/resources/features",
        glue="stepDefinitions",
        tags="@Wask",
        dryRun=false




)

public class Runners {



}
