package com.Linio.questions;

import com.Linio.userinterfaces.Linio_Page_Choose;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheCheckStart  implements Question<Integer>  {

	@Override
	public Integer answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		 int sizes= Text.of(Linio_Page_Choose.SOLO_HOY)
				.viewedBy(actor)                        
	            .asList().size();
		 if(sizes>0) {
			 return 1;
		 }
		 else {
			 return 0;
		 }
	}

	public static TheCheckStart displayed() {
		// TODO Auto-generated method stub
		return new TheCheckStart();
	}
	
	
}
