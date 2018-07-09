package pizzaFactory;

public interface IngredientsFactory {
	Dough makeDough();
	Sauce makeSauce();
	Cheese makeCheese();
	Veggies[] makeVeggies();
	Pepperoni makePepperoni();
	Clams makeClams();
}


class Garlic extends Veggies{

	@Override
	public String toString() {
		return "Garlic []";
	}
	
}
class Onion extends Veggies{

	@Override
	public String toString() {
		return "Onion []";
	}
	
}
class Mushroom extends Veggies{

	@Override
	public String toString() {
		return "Mushroom []";
	}

}

class RedPepper extends Veggies{

	@Override
	public String toString() {
		return "RedPepper []";
	}
	
}
class Dough{

	@Override
	public String toString() {
		return "Dough []";
	}
	
}


class Sauce{

	@Override
	public String toString() {
		return "Sauce []";
	}
	
}

class Veggies{

	@Override
	public String toString() {
		return "Veggies []";
	}
	
}

class Cheese{

	@Override
	public String toString() {
		return "Cheese []";
	}
	
}

class Pepperoni{

	@Override
	public String toString() {
		return "Pepperoni []";
	}
	
}

class Clams{

	@Override
	public String toString() {
		return "Clams []";
	}
	
}

class ThinCrustDough extends Dough{

	@Override
	public String toString() {
		return "ThinCrustDough []";
	}
	
}

class MarinaraSauce extends Sauce{

	@Override
	public String toString() {
		return "MarinaraSauce []";
	}
	
}

class ReggianoCheese extends Cheese{

	@Override
	public String toString() {
		return "ReggianoCheese []";
	}
	
}

class SlicedPepperoni extends Pepperoni{

	@Override
	public String toString() {
		return "SlicedPepperoni []";
	}
	
}

class FreshClams extends Clams{

	@Override
	public String toString() {
		return "FreshClams []";
	}
	
}
class ThickCrustDough extends Dough{

	@Override
	public String toString() {
		return "ThickCrustDough []";
	}
	
}
class PlumTomatoSauce extends Sauce{

	@Override
	public String toString() {
		return "PlumTomatoSauce []";
	}
	
}
class Mozzarella extends Cheese{

	@Override
	public String toString() {
		return "Mozzarella []";
	}
	
}
class Spinach extends Veggies{

	@Override
	public String toString() {
		return "Spinach []";
	}
	
}

class FrozenClams extends Clams{

	@Override
	public String toString() {
		return "FrozenClams []";
	}
	
}

class BlackOlives extends Veggies{

	@Override
	public String toString() {
		return "BlackOlives []";
	}
	
}
//蛋+植物 = 茄子
class EggPlant extends Veggies{

	@Override
	public String toString() {
		return "EggPlant []";
	}
	
}
