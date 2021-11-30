package com.cucumber.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
features = "src/test/java/com/cucumber/test/",glue={"src/test/java/com/cucumber/test/"},monochrome=true)
public class CucumberRunTest {



}