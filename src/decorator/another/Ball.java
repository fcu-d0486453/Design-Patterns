package decorator.another;

public class Ball extends ChristmasKazariMono {

	ChristmasTree christmasTree;  
	
	public Ball(ChristmasTree christmasTree) {
		this.christmasTree = christmasTree;
	}

	@Override
	public String showSomething() {
		return christmasTree.showSomething() + ", Ball";
	}

}
