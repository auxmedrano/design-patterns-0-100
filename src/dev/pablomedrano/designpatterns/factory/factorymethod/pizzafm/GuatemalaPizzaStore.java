package dev.pablomedrano.designpatterns.factory.factorymethod.pizzafm;

public class GuatemalaPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		return switch (item) {
			case "cheese" -> new GTStyleCheesePizza();
			case "veggie" -> new GTStyleVeggiePizza();
			case "hawaiian" -> new GTStyleHawaiianPizza();
			case "pepperoni" -> new GTStylePepperoniPizza();
			default -> null;
		};
	}
}
