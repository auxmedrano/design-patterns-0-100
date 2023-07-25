package dev.pablomedrano.designpatterns.factory.factorymethod.pizzafm;

public class MedraPizzaStore {
 
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("GT")) {
			switch (type) {
				case "cheese" -> pizza = new GTStyleCheesePizza();
				case "veggie" -> pizza = new GTStyleVeggiePizza();
				case "clam" -> pizza = new GTStyleHawaiianPizza();
				case "pepperoni" -> pizza = new GTStylePepperoniPizza();
			}
		} else if (style.equals("SanPedro")) {
			pizza = switch (type) {
				case "cheese" -> new SPStyleCheesePizza();
				case "veggie" -> new SPStyleVeggiePizza();
				case "clam" -> new SPStyleHawaiianPizza();
				case "pepperoni" -> new SPStylePepperoniPizza();
				default -> pizza;
			};
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
