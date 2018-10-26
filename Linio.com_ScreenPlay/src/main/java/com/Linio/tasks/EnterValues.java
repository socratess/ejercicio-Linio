package com.Linio.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.startsWith;

import com.Linio.exceptions.IncorrectNumber;
import com.Linio.exceptions.NoFoundTheSameProductAfterBuyCar;
import com.Linio.exceptions.NoFoundTheSameProductAfterChoose;
import com.Linio.models.DatosBusqueda;
import com.Linio.questions.TheCheckProductNameAfterChoose;
import com.Linio.questions.TheCheckProductNameAfterUseToBuyCar;
import com.Linio.questions.TheCheckTheNumber;
import com.Linio.userinterfaces.Linio_Page_Choose;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;

public class EnterValues implements Task{

	private DatosBusqueda dates;


	public EnterValues(DatosBusqueda dates) {
		this.dates=dates;

	}


	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(SelectFromOptions.byVisibleText(dates.getCategory()).from(Linio_Page_Choose.CATEGORIA));

		actor.attemptsTo(Enter.theValue(dates.getProduct()).into(Linio_Page_Choose.BUSQUEDA_TEXTAREA));
		actor.attemptsTo(Click.on(Linio_Page_Choose.BUSQUEDA));	
		//actor.attemptsTo(Click.on(Linio_Page_Choose.SOLO_HOY));	
       String cantidad_productsxs = (Text.of(Linio_Page_Choose.CANTIDAD_PRODUCTO).viewedBy(actor).asString());
      String[] cantidad_productsx=cantidad_productsxs.split(" ");
      String cant = cantidad_productsx[0]; 
      String []c=cant.split(",");
      String cc=c[0]+c[1];
      int ch= Integer.parseInt(cc);
      System.out.println(ch+"vf"); 
	   actor.should(seeThat(TheCheckTheNumber.displayed(),greaterThanOrEqualTo(Integer.parseInt(dates.getNumberindex()))).orComplainWith(IncorrectNumber.class, IncorrectNumber.getmessagestart()));
		//Linio_Page_Choose.LISTADO;
		actor.attemptsTo(SelectFromOptions.byVisibleText(dates.getFilter()).from(Linio_Page_Choose.FILTRO_BUSQUEDA));
       
		String name_productsee = (Text.of(Linio_Page_Choose.LISTADO.of(dates.getNumberindex())).viewedBy(actor).asString());
		String name_producto1=name_productsee.substring(0, 20);
		System.out.println(name_producto1+"1"); 
		actor.attemptsTo(Scroll.to(Linio_Page_Choose.LISTADO.of(dates.getNumberindex())));
		actor.attemptsTo(Click.on(Linio_Page_Choose.LISTADO.of(dates.getNumberindex())));
		//actor.should(seeThat(TheCheckProductNameAfterChoose.displayed(),startsWith(name_producto1)).orComplainWith(NoFoundTheSameProductAfterChoose.class, NoFoundTheSameProductAfterChoose.getmessagestart()));
		
		
		String name_producto2 = (Text.of(Linio_Page_Choose.NAME_PRODUCTO_DESPUES_DE_SELECCIONARLO).viewedBy(actor).asString());
		System.out.println(name_producto2+"2"); 
		
		//String talla= (Text.of(Linio_Page_Choose.PRODUCT_OPTION.of("1")).viewedBy(actor).asString());//causa problemas
		//System.out.println(talla); 
		
		if ((Text.of(Linio_Page_Choose.PRODUCT_OPTION.of("1")).viewedBy(actor).asString()) != null) {
		actor.attemptsTo(Click.on(Linio_Page_Choose.PRODUCT_OPTION.of("1")));}
		
//		actor.attemptsTo(SelectFromOptions.byVisibleText("XL").from(Linio_Page_Choose.PRODUCT_OPTION));
//		actor.attemptsTo(SelectFromOptions.byVisibleText("L/XL").from(Linio_Page_Choose.PRODUCT_OPTION));
		actor.attemptsTo(Click.on(Linio_Page_Choose.CARRITO));
		actor.attemptsTo(Click.on(Linio_Page_Choose.IR_CARRITO));
		actor.should(seeThat(TheCheckProductNameAfterUseToBuyCar.displayed(),containsString(name_producto2)).orComplainWith(NoFoundTheSameProductAfterBuyCar.class, NoFoundTheSameProductAfterBuyCar.getmessagestart()));
		
		
		String cantidad_products = (Text.of(Linio_Page_Choose.NAME_PRODUCTO_IN_CARBUY).viewedBy(actor).asString());
		System.out.println(cantidad_products+"+3"); 
		actor.attemptsTo(SelectFromOptions.byVisibleText(dates.getQuantity()).from(Linio_Page_Choose.CANTIDAD));
		actor.attemptsTo(Click.on(Linio_Page_Choose.ELIMINAR));
		actor.attemptsTo(Click.on(Linio_Page_Choose.BUY_NOW));
		
		
		
		
		
	}

	public static EnterValues in(DatosBusqueda dates) {
		// TODO Auto-generated method stub
		return instrumented(EnterValues.class, dates);
	}


}

/*int num_val=Integer.parseInt(dates.getNumberindex());
if (num_val>60){
double y = Math.ceil(num_val/60);
System.out.println(num_val); 
int uu= (int)y;
for (int i=0;i<uu;i++) {
	actor.attemptsTo(Scroll.to(Linio_Page_Choose.NEXT_ONE_STEP));
	actor.attemptsTo(Click.on(Linio_Page_Choose.NEXT_ONE_STEP));
	System.out.println(uu); 
}

}*/