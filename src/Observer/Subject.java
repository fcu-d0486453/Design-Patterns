package Observer;

public interface Subject {
	void registerObserver(Observer o);
	void removeObject(Observer o);
	void notifyObservers();
}
