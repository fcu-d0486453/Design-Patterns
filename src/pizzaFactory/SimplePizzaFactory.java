package pizzaFactory;

public class SimplePizzaFactory {//沒有繼承 他是直接使用的
	public Pizza CreatePizza(String type) {
		
		Pizza pizza = null;
		
		if( type.equals("cheese")) {
			return new CheesePizza();
		}else if(type.equals("veggie")) {
			return new VeggiePizza();
		}else if(type.equals("clam")) {
			return new ClamPizza();
		}else if(type.equals("pepperoni")) {
			return new PepperoniPizza();
		}
		
		return pizza;
	}
}
