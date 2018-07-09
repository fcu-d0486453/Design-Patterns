package pizzaFactory;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		
		IngredientsFactory factory =
				new ChicagoPizzaIngredientFactory();
		Pizza pizza = null;
		
		if( item.equals("cheese")) {
			pizza =  new CheesePizza(factory);
			pizza.setName("Chicago CheesePizza");
			
			
		}else if(item.equals("Chicago veggie")) {
			pizza = new VeggiePizza(factory);
			pizza.setName("Chicago VeggiePizza");
		}else if(item.equals("clam")) {
			pizza = new ClamPizza(factory);
			pizza.setName("Chicago ClamPizza");
		}else if(item.equals("pepperoni")) {
			pizza = new PepperoniPizza(factory);
			pizza.setName("Chicago PepperoniPizza");
		}
		return pizza;
	}
	

}
