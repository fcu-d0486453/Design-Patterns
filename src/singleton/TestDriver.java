package singleton;

public class TestDriver {

	public static void main(String[] args) {
		ChocolateBoiler chocolateBoiler = 
			ChocolateBoiler.getInstance();
		ChocolateBoiler chocolateBoiler2 = 
				ChocolateBoiler.getInstance();
				
		System.out.println( chocolateBoiler.hashCode() );
		System.out.println( chocolateBoiler2.hashCode() );
	}

}
