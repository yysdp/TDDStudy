package 观察者模式;

public interface Subject {
	public void addObserver(Observer o);
	   public void deleteObserver(Observer o);
	   public void notifyObservers();

}
