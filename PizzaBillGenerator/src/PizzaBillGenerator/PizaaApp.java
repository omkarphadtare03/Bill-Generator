package PizzaBillGenerator;
public class PizaaApp {

	public static void main(String[] args) {
		//Pizza basePizza = new Pizza(true);
		//basePizza.getPizzaPrice();
	//	basePizza.getdelux();
		Pizza basePizza = new Pizza(false);
		basePizza.addExtraCheese();
		basePizza.addExtraToppings();
		basePizza.getBill();
		

	}

}
