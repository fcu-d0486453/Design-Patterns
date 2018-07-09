package decorator;

public class Milk extends Condiment {
	
	Drink drink;
	//這裡的 drink 是很 廣的(所有配料、飲料、之類的)
	public Milk(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String toString() {
		return "Milk [drink=" + drink + "]";
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		System.out.println("Milk $20");
		return drink.cost() + 20;
	}

}
