package com.Linio.userinterfaces;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Linio_Page_Choose {
	
	//div[@class='catalogue-product row'][{0}]/a
	
	
	
	public static final Target CATEGORIA= Target.the("Choose to favorite category").located(By.id("searchCategoryDropdown"));
	public static final Target BUSQUEDA_TEXTAREA=Target.the("Look to favorite product TEXT").located(By.name("q"));
	public static final Target BUSQUEDA=Target.the("Look to favorite product OPTION").locatedBy("//button[@class='btn btn-primary' and @type='submit']/span[@class='icon icon-inverse']");
	public static final Target LISTADO=Target.the("list").locatedBy("//div[@class='catalogue-product row'][{0}]/a");
    public static final Target CARRITO=Target.the("buy product").located(By.id("buy-now"));
    public static final Target IR_CARRITO=Target.the("check the bought product").locatedBy("//a[@class='btn btn-sm btn-go-to-cart']");
    public static final Target CANTIDAD=Target.the("COUNTER PRODUCT").locatedBy("//select[@ng-model='item.quantity']");
	public static final Target ELIMINAR=Target.the("delete product from the buy car").locatedBy("//div[@class='delete-section col-xs-1']/span[@class='icon icon-sm']");
    public static final Target BUY_NOW =Target.the("Buy now a new product").locatedBy("//a[@href='/' and @class='btn btn-md btn-primary']");
    public static final Target SOLO_HOY=Target.the("Link solo hoy").locatedBy("//div[@class='navbar-title hidden-md-down']");
    public static final Target CANTIDAD_PRODUCTO=Target.the("products").locatedBy("//span[@class='highlight']");//("//div[@class='catalogue-section-title']//span[@class='quantity-icon']");
    public static final Target NAME_PRODUCTO_IN_CARBUY=Target.the("product name at buycar").locatedBy("//div[@class='cart-item row']/div/div/span/a");
    //"//div[@class='cart-item row']/div/a"
    public static final Target NAME_PRODUCTO_DESPUES_DE_SELECCIONARLO=Target.the("product after choose it").locatedBy("//div[@class='product-title col-xs-12']/h1/span");
    public static final Target NEXT_ONE_STEP= Target.the("next to page").locatedBy("//ul[@class='pagination']/li[6]/a/span");

    public static final Target FILTRO_BUSQUEDA= Target.the("FILTER SEARCH").located(By.id("order-selector"));
	public static final Target PRODUCT_OPTION= Target.the("OPTIONZ ABOUT SIZE").locatedBy("//label[@for='option-{0}']");
////span[@class='highlight']
}
