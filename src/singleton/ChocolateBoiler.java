package singleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	//★ volatile : 讓多個執行緒，處理 uniqueBoiler 是正確的。
	private static volatile ChocolateBoiler uniqueBoiler;
	
	public static ChocolateBoiler getInstance() {
		
		if ( uniqueBoiler == null ) {
			//進入區塊 仍是 null 才進入 critical section
			synchronized ( ChocolateBoiler.class ){
				if (uniqueBoiler == null) {
					uniqueBoiler = new ChocolateBoiler();
				}
			}
		}
		
		return uniqueBoiler;
	}
	
	private ChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			//排出巧克力
			boiled = true;
		}
	}
	
	public void boil() {
		boiled = true;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			//裝滿巧克力 & 牛奶 混合物 未煮
		}
	}
	
	
}
