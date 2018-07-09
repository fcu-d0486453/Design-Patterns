package Observer;
import java.util.ArrayList;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;//ArrayList create in constructor
	private float temperature;
	private float humidity;
	private float pressure;
	
	WeatherData(){
		observers = new ArrayList<Observer>();
	}
	
	//-----------------------------介面實作-------------------------
	@Override
	public void registerObserver(Observer o) {/*register observer, 
	                                            just add observers in ArrayList*/
		observers.add(o);
	}

	@Override
	public void removeObject(Observer o) {
		int i = observers.indexOf(o);//indexOf my return -, when not exist.
		if( i >= 0 ) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer ob : observers) {
			ob.update(temperature, humidity, pressure);
		}
	}
	//----------------------------/介面實作-------------------------
	
	//氣溫改變時要去提醒
	public void measurementsChanged() {
		notifyObservers();
	}
	
	//自己設定氣溫用
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	// 等等等 其他方法...
}
