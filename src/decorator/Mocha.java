package decorator;

public class Mocha extends Condiment {
	
	Drink drink;
	//這裡的 drink 是很 廣的(所有配料、飲料、之類的)
	public Mocha(Drink drink) {
		this.drink = drink;
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return drink.cost() + 15;
	}

}
