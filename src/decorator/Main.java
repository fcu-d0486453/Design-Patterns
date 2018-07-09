package decorator;

public class Main {
	public static void main(String[] args) {
		Drink myDrink = new NormalCoffee();
		System.out.println( myDrink.toString() );
		
		myDrink = new Milk(myDrink);
		System.out.println( myDrink.toString() );
		
		myDrink = new Milk(myDrink);
		System.out.println( myDrink.toString() );
		
		myDrink = new Sugar(myDrink);
		System.out.println( myDrink.toString() );
		
		
		System.out.println( myDrink.getDescription() );
		System.out.println( myDrink.cost() );
	}
}
