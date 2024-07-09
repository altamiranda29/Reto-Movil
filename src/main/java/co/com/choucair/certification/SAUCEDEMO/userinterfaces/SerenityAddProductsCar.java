package co.com.choucair.certification.SAUCEDEMO.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityAddProductsCar {

    public static final Target PRODUCT1 = Target.the("producto 1")
            .located(By.id("item_4_title_link"));
    public static final Target PRODUCT2 = Target.the("producto 2")
            .located(By.id("item_0_title_link"));
    public static final Target PRODUCT3 = Target.the("producto 3")
            .located(By.id("item_1_title_link"));
    public static final Target ADD_TO_CART = Target.the("agregar al carrito")
            .located(By.id("add-to-cart"));
    public static final Target BACK_TO_PRODUCTS = Target.the("back-to-products")
            .located(By.id("back-to-products"));
    public static final Target SHOPPING_CART_LINK = Target.the("Shopping cart link")
            .located(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
    public static final Target PRODUCT_1 = Target.the("text product")
            .located(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
    public static final Target PRODUCT_2 = Target.the("text product")
            .located(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
    public static final Target PRODUCT_3 = Target.the("text product")
            .located(By.xpath("//*[@id=\"item_1_title_link\"]/div"));
}
