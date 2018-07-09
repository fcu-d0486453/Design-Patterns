package decorator;

public class HouseBlend extends Drink {

	public HouseBlend(){
		description = "HouseBlend";
	}
	
	@Override
	public double cost() {
		return 55;
	}

}
