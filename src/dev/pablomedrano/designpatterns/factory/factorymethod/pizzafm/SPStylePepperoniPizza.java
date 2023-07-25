package dev.pablomedrano.designpatterns.factory.factorymethod.pizzafm;

public class SPStylePepperoniPizza extends Pizza {
	public SPStylePepperoniPizza() {
		name = "San Pedro Style Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
