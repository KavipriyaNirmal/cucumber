package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature File\\Facebook.feature",
				glue="org.stepdefinition",
				monochrome=true)
public class TestRunnerClass {

}
