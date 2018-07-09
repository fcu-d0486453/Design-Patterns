package decorator;

public class Whip extends Condiment {
	
	Drink drink;//委派
	//這裡的 drink 是很 廣的(所有配料、飲料、之類的)
	public Whip(Drink drink) {
		this.drink = drink; 
	}

	@Override
	public String getDescription() {
		return drink.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return drink.cost() + 5;
	}

}
