package decorator.another;

public class Main {

	public static void main(String[] args) {
		ChristmasTree CT = new AbiesBalsamea();
		CT = new Star(CT);
		CT = new Star(CT);
		CT = new Ball(CT);
		System.out.println( CT.showSomething() );

	}

}
