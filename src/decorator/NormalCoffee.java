package decorator;

public class NormalCoffee extends Drink {

	public NormalCoffee() {
		description = "NormalCoffee";
	}
	
	@Override
	public String toString() {
		return "NormalCoffee";
	}

	public double cost() {
		return 50;
	}

}
