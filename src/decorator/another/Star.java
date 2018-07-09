package decorator.another;

public class Star extends ChristmasKazariMono {
	
	ChristmasTree christmasTree;
	
	public Star(ChristmasTree christmasTree) {
		this.christmasTree = christmasTree;
	}

	@Override
	public String showSomething() {
		return christmasTree.showSomething() + ", Star"; 
	}

}
