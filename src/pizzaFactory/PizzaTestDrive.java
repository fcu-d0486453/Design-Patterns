package pizzaFactory;

public class PizzaTestDrive {
	/*
	 * Pizza 點的 type 有: cheese, veggie, clam, pepperoni
	 */
	public static void main(String[] args) {
		/* 物件的建立 是現實的 如果沒有 new出任何物件 
		 * 就無法建立 JAVA程式
		 * 利用柵欄(這裡所new的store物件)圍起來，
		 * 保護這些建立物件的程式碼。
		 */
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		
		//我們不會去 new 到 真正的 Pizza 我們是利用 他們的子類別 具象化
		Pizza pizza = nyStore.orderPizza("cheese");//參數參考上面
		System.out.println("Tony ordered a " + 
		pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Brian ordered a " + 
				pizza.getName() + "\n");
				
	}

}
