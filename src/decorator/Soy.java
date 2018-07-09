package decorator;

public class Soy extends Condiment {
	
	Drink drink;
	//這裡的 drink 是很 廣的(所有配料、飲料、之類的)
	public Soy(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDescription() {
		return drink.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return drink.cost() + 10;
	}

}
