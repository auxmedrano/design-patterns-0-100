package dev.pablomedrano.designpatterns.factory.factorymethod.pizzafm;

public class SPStyleHawaiianPizza extends Pizza {
	public SPStyleHawaiianPizza() {
		name = "San Pedro Style Hawaiian Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Pineapple");
		toppings.add("Ham");
		toppings.add("cherries in syrup");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
