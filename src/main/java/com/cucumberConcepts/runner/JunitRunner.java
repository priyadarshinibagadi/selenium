package com.cucumberConcepts.runner;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features={"Hooks.feature"},
                  glue={"com.cucumberConcepts.run"},
                  format={"pretty","html:test-output","json:json-output/cucumber.json",
                		  "junit:junit-xml/cucumber.xml"},dryRun=true,monochrome=true)


public class JunitRunner {

}
