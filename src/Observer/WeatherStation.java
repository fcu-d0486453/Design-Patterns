package Observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();//建立出氣象站
		
		//第一個觀察者
		CurrentConditionsDisplay currentDisplay = 
				new CurrentConditionsDisplay (weatherData);
		
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay (weatherData);
		/*尚未實作
		 * ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);  
		 */
		
		//模擬器項數據
		try {
			Thread.currentThread();
			weatherData.setMeasurements(80, 65, 30.4f);
			Thread.sleep(1000);
			weatherData.setMeasurements(82, 70, 29.2f);
			Thread.sleep(3000);
			weatherData.setMeasurements(78, 90, 28.4f);
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO 自動產生的 catch 區塊
			e.printStackTrace();
		}
	}
}
