package dev.pablomedrano.designpatterns.factory.factorymethod.pizzafm;

public class SanPedroPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		return switch (item) {
			case "cheese" -> new SPStyleCheesePizza();
			case "veggie" -> new SPStyleVeggiePizza();
			case "hawaiian" -> new SPStyleHawaiianPizza();
			case "pepperoni" -> new SPStylePepperoniPizza();
			default -> null;
		};
	}
}
