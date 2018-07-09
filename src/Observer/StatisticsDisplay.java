package Observer;

public class StatisticsDisplay implements Observer, DisplayElement{
	
	private float temp;
	private float humidity;
	private float pressure;
	private Subject subject;
	
	public StatisticsDisplay(Subject subject){
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println(temp);
		System.out.println(humidity);
		System.out.println(pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
