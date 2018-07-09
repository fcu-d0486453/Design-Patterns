package pizzaFactory;

public class NYPizzaIngredientFactory implements IngredientsFactory {

	@Override
	public Dough makeDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce makeSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese makeCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] makeVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(),
				new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni makePepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams makeClams() {
		return new FreshClams();
	}

}
