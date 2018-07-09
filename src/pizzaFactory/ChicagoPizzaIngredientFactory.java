package pizzaFactory;

public class ChicagoPizzaIngredientFactory implements IngredientsFactory {

	@Override
	public Dough makeDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce makeSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese makeCheese() {
		return new Mozzarella();
	}

	@Override
	public Veggies[] makeVeggies() {
		Veggies veggies[] = { new EggPlant(), new Spinach(),
				new BlackOlives()};
		return veggies;
	}

	@Override
	public Pepperoni makePepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams makeClams() {
		return new FrozenClams();
	}

}
