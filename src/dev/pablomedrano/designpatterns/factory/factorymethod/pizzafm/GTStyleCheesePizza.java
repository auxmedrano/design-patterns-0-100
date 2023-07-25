package dev.pablomedrano.designpatterns.factory.factorymethod.pizzafm;

public class GTStyleCheesePizza extends Pizza {

	public GTStyleCheesePizza() {
		name = "GT Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
	}
}
