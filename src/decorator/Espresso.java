package decorator;

public class Espresso extends Drink{

	public Espresso() {//來自 Drink 的變數
		description = "Espresso";
	}

	public double cost() {
		return 75;
	}

}
