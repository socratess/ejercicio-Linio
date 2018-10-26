package com.Linio.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheMainPage implements Task{

	private PageObject pag;

	public OpenTheMainPage(PageObject pag) {
		this.pag=pag;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(pag));

	}

	public static OpenTheMainPage on(PageObject pag) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(OpenTheMainPage.class,pag);
	}

}
