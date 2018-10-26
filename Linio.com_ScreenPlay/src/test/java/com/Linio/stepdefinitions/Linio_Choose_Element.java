package com.Linio.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.greaterThan;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.Linio.exceptions.NoFoundAnyElement;
import com.Linio.models.DatosBusqueda;
import com.Linio.questions.TheCheckStart;
import com.Linio.tasks.EnterValues;
import com.Linio.tasks.OpenTheMainPage;
import com.Linio.userinterfaces.LinioHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class Linio_Choose_Element {
	
	@Managed(driver="chrome")
	private WebDriver hisbrowser;

	private LinioHomePage LinioHomePage;
	private Actor socra = Actor.named("socra");
	
	@Before
	public void setUp() {
		socra.can(BrowseTheWeb.with(hisbrowser));
		hisbrowser.manage().window().maximize();
			


	}
	
	
	@Given("^That socrat want to choose a element$")
	public void thatSocratWantToChooseAElement() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   socra.wasAbleTo(OpenTheMainPage.on(LinioHomePage));
	 socra.should(seeThat(TheCheckStart.displayed(),greaterThan(0)).orComplainWith(NoFoundAnyElement.class, NoFoundAnyElement.getmessagestart()));
		
	}


	@When("^he choose the product with the category and product$")
	public void heChooseTheElementWithTheAnd(List<DatosBusqueda> dates) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   socra.attemptsTo(EnterValues.in(dates.get(0)));
	 //  Linio_Page_Choose.LISTADO.(type[]) collection.toArray(new type[collection.size()]);
}

	@Then("^he should see the option Tu producto se agrego al carrito in the screen$")
	public void heShouldSeeTheOptionTuProductoSeAgregAlCarritoInTheScreen() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	}
}
