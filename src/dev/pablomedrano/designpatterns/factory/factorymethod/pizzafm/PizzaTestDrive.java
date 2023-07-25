package dev.pablomedrano.designpatterns.factory.factorymethod.pizzafm;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore guatemalaPizzaStore = new GuatemalaPizzaStore();
		PizzaStore sanPedroPizzaStore = new SanPedroPizzaStore();
 
		Pizza pizza = guatemalaPizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = sanPedroPizzaStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = guatemalaPizzaStore.orderPizza("hawaiian");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = sanPedroPizzaStore.orderPizza("hawaiian");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = guatemalaPizzaStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = sanPedroPizzaStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = guatemalaPizzaStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = sanPedroPizzaStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
