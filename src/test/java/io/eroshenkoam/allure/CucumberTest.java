package io.eroshenkoam.allure;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"io.qameta.allure.cucumber2jvm.AllureCucumber2Jvm", "pretty"},
        features = {"src/test/resources/"}
)
public class CucumberTest {

}