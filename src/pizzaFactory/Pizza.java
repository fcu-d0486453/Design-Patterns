package pizzaFactory;
import java.util.ArrayList;

public abstract class Pizza {
	protected String name;
	protected Dough dough;//麵團
	protected Sauce sauce;
	protected Clams clams;
	protected Pepperoni pepperoni;
	protected Cheese cheese;
	
	ArrayList<String> toppings = new ArrayList<String>();
	
	abstract public void prepare();//準備 原料 由 抽象工廠 建立
	
	public void bake() {
		System.out.println("Bake for 25 minute");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices.");
	}
	
	public void box() {
		System.out.println("Place pizza in official Pizza StoreBox");
	}

	public String getName() {
		return name;
	}
	
	public void setName(String s) {
		this.name = s;
	}
}
//-------------------------------------以下為實作
class VeggiePizza extends Pizza{
	
	IngredientsFactory factory;
	
	
	public VeggiePizza(IngredientsFactory factory) {
		this.factory = factory;
	}

	@Override
	public void prepare() {
		
		
	}

	public VeggiePizza() {
		name = "VeggiePizza";
	}
	
}

class ClamPizza extends Pizza{

	IngredientsFactory factory;
	
	public ClamPizza() {
		
	}

	public ClamPizza(IngredientsFactory factory) {
		name = "ClamPizza";
		this.factory = factory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = factory.makeDough();
		System.out.println(dough.toString());
		sauce = factory.makeSauce();
		System.out.println(sauce.toString());
		cheese = factory.makeCheese();
		System.out.println(cheese.toString());
		
	}
	
}

class CheesePizza extends Pizza{

	IngredientsFactory factory;
	
	public CheesePizza(IngredientsFactory factory) {
		name = "CheesePizza";
		this.factory = factory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = factory.makeDough();
		System.out.println(dough.toString());
		sauce = factory.makeSauce();
		System.out.println(sauce.toString());
		cheese = factory.makeCheese();
		System.out.println(cheese.toString());
	}

	public CheesePizza() {
		name = "CheesePizza";
	}
	
}

class PepperoniPizza extends Pizza {
	
	IngredientsFactory factory;
	
	public PepperoniPizza(IngredientsFactory factory) {
		this.factory = factory;
	}

	@Override
	public void prepare() {
		// TODO 自動產生的方法 Stub
		
	}

	public PepperoniPizza() {
		name = "PepperoniPizza";
	}
	
}

class NYStyleCheesePizza extends Pizza{
	
	@Override
	public void prepare() {
		// TODO 自動產生的方法 Stub
		
	}

	public NYStyleCheesePizza() {
		name = "NYStyleCheesePizza";
		
		
		//toppings 是 ArrayList
		toppings.add("Grated Reggiano Cheese");
	}
	
}

class NYStyleVeggiePizza extends Pizza{

	@Override
	public void prepare() {
		// TODO 自動產生的方法 Stub
		
	}

	public NYStyleVeggiePizza() {
		name = "NYStyleVeggiePizza";
	}	
}

class NYStyleClamPizza extends Pizza{

	@Override
	public void prepare() {
		// TODO 自動產生的方法 Stub
		
	}

	public NYStyleClamPizza() {
		name = "NYStyleClamPizza";
	}
}

class NYStylePepperoniPizza extends Pizza{

	@Override
	public void prepare() {
		// TODO 自動產生的方法 Stub
		
	}

	public NYStylePepperoniPizza() {
		name = "NYStylePepperoniPizza";
	}
	
}

class ChicagoStylePizza extends Pizza{

	@Override
	public void prepare() {
		// TODO 自動產生的方法 Stub
		
	}

	public ChicagoStylePizza() {
		name = "ChicagoStylePizza";
	}
}

class ChicagoStyleCheesePizza extends Pizza{

	@Override
	public void prepare() {
		// TODO 自動產生的方法 Stub
		
	}

	public ChicagoStyleCheesePizza() {
		name = "ChicagoStyleCheesePizza";
		
		toppings.add("Shredded Mozzarella Cheese");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices*");
	}
}

class ChicagoStylePepperoniPizza extends Pizza{

	@Override
	public void prepare() {
		// TODO 自動產生的方法 Stub
		
	}

	public ChicagoStylePepperoniPizza() {
		name = "ChicagoStylePepperoniPizza";
	}
}

class ChicagoStyleClamPizza extends Pizza{

	@Override
	public void prepare() {
		// TODO 自動產生的方法 Stub
		
	}

	public ChicagoStyleClamPizza() {
		name = "ChicagoStyleClamPizza";
	}
}

class ChicagoStyleVeggiePizza extends Pizza{

	@Override
	public void prepare() {
		// TODO 自動產生的方法 Stub
		
	}

	public ChicagoStyleVeggiePizza() {
		name = "ChicagoStyleVeggiePizza";
	}
}