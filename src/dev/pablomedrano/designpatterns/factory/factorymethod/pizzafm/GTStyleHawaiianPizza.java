package dev.pablomedrano.designpatterns.factory.factorymethod.pizzafm;

public class GTStyleHawaiianPizza extends Pizza {

	public GTStyleHawaiianPizza() {
		name = "GT Style Hawaiian Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Pineapple");
		toppings.add("Ham");
	}
}
