package dev.pablomedrano.designpatterns.factory.factorymethod.pizzafm;

public class GTStylePepperoniPizza extends Pizza {

	public GTStylePepperoniPizza() {
		name = "GT Style Pepperoni Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Sliced Pepperoni");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Mushrooms");
		toppings.add("Red Pepper");
	}
}
