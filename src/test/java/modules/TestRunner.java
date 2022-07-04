package modules;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {"pretty","json:target/json/Result.json"},
        features = {"src/test/resources/features"},
        glue = {"modules","steps_dif"},
        tags = {"@AddProduct"}
)
public class TestRunner {
}
