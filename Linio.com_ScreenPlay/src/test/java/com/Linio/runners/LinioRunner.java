package com.Linio.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class) 
@CucumberOptions(
		features="src/test/resources/com/Linio/features/Linio_Choose_Elements.feature",
		glue="com.Linio.stepdefinitions",
		snippets=SnippetType.CAMELCASE
	)	

public class LinioRunner {

}
