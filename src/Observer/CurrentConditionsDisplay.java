package Observer;

//這是觀察者其中之一, 所以他要繼承 觀察者, 顯示元素
public class CurrentConditionsDisplay implements Observer, DisplayElement{
	
	private float temperature;
	private float humidity;
	private Subject weatherData;//作為註冊 主題用
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	//-------------------------實作介面---------------------------
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature 
				+ "F degrees and " + humidity + "% humidity");
	}
	//------------------------/實作介面---------------------------
}
