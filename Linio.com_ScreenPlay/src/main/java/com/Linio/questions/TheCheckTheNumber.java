package com.Linio.questions;

import com.Linio.userinterfaces.Linio_Page_Choose;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheCheckTheNumber implements Question<Integer>{
	
	@Override
	public Integer answeredBy(Actor actor) {
//	int sizes= Text.of(Linio_Page_Choose.SOLO_HOY)
//				.viewedBy(actor)                        
//	            .asList().size();
		String cantidad_productsxs = (Text.of(Linio_Page_Choose.CANTIDAD_PRODUCTO).viewedBy(actor).asString());
		  String[] cantidad_productsx=cantidad_productsxs.split(" ");
	      String cant = cantidad_productsx[0]; 
	      String []c=cant.split(",");
	      String cc=c[0]+c[1];
	      int ch= Integer.parseInt(cc);
			 return ch;
					 
					 /*Text.of(Linio_Page_Choose.CANTIDAD_PRODUCTO)
					 .viewedBy(actor)
					 .asInteger();
		 */
	}

	public static TheCheckTheNumber displayed() {
		// TODO Auto-generated method stub
		return new TheCheckTheNumber();
	}
}
