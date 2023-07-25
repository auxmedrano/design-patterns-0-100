package dev.pablomedrano.designpatterns.factory.factorymethod.pizzafm;

public class SPStyleCheesePizza extends Pizza {

	public SPStyleCheesePizza() {
		name = "San Pedro Style Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
