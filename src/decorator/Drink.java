package decorator;

public abstract class Drink {
	
	protected String description = "Unknow Drink...";
	
	public String getDescription(){
		return description;
	}
	public abstract double cost();
}