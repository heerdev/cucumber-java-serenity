package com.bdd.serenity;

import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/k12report/bdd/feature",plugin={"html:target/html","json:target_json/cucumber.json"})
public class AcceptanceTestSuite {

}
