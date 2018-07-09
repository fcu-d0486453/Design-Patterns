package decorator;

public class Sugar extends Condiment {
	Drink drink;
	
	//這裡的 drink 是很 廣的(所有配料、飲料、之類的)
	public Sugar(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String toString() {
		return "Sugar [drink=" + drink + "]";
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + ", Sugar";
	}

	@Override
	public double cost() {
		return drink.cost() + 5;
	}

}
