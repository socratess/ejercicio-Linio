package com.Linio.questions;

import com.Linio.userinterfaces.Linio_Page_Choose;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheCheckProductNameAfterChoose  implements Question<String>{
	@Override
	public String answeredBy(Actor actor) {
		
			 return Text.of(Linio_Page_Choose.NAME_PRODUCTO_DESPUES_DE_SELECCIONARLO)
					 .viewedBy(actor).
					 asString();		 
	}

	public static TheCheckProductNameAfterChoose displayed() {
		// TODO Auto-generated method stub
		return new TheCheckProductNameAfterChoose();
	}
}
