package dev.pablomedrano.designpatterns.factory.factorymethod.pizzafm;

public class GTStyleVeggiePizza extends Pizza {

	public GTStyleVeggiePizza() {
		name = "GT Style Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Mushrooms");
		toppings.add("Red Pepper");
	}
}
