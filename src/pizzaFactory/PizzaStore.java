package pizzaFactory;

public abstract class PizzaStore {
	
	/* 他(PizzaStroe 抽象)並不知道 正在烘培的Pizza是何種，
	 * 但是可以知道此 Pizza
	 * 可以執行 prepare, bake, cut, box 方法
	 * 由於 Pizza 是抽象的，不知道具象類別是誰，
	 * 這就是 鬆綁(decouple)
	 */
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);//讓 OO_Store自己決定 用何種風味
		//pizza = factory.CreatePizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	//此宣告 並 不知道 次類別會如何實踐，但是跟 orderPizza 合作無間。
	abstract Pizza createPizza(String type);	
}