package dev.pablomedrano.designpatterns.factory.factorymethod.pizzafm;

public class SPStyleVeggiePizza extends Pizza {
	public SPStyleVeggiePizza() {
		name = "San Pedro Veggie Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
