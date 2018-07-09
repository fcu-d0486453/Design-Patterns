package pizzaFactory;

public class NYPizzaStore extends PizzaStore {
	
	@Override
	Pizza createPizza(String item) {
		IngredientsFactory factory =
				new NYPizzaIngredientFactory();
		Pizza pizza = null;
		
		if( item.equals("cheese")) {
			pizza = new CheesePizza(factory);
			pizza.setName("New York Style Cheese Pizza");
		}else if(item.equals("veggie")) {
			pizza = new VeggiePizza(factory);
			pizza.setName("New York Style Veggie Pizza");
		}else if(item.equals("clam")) {
			pizza = new ClamPizza(factory);
			pizza.setName("New York Style Clam Pizza");
		}else if(item.equals("pepperoni")) {
			pizza = new PepperoniPizza(factory);
			pizza.setName("New York Style Pepperoni Pizza");
		}
		return pizza;
	}
}