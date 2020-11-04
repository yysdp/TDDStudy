package 观察者模式;

public class Application {
	

	public static void main(String[] args) {
		HydrologicalStation subject = new HydrologicalStation();
		Observer observer = new Headquarters(subject);
		subject.giveNewMess(200, 50);
		subject.notifyObservers();
		subject.giveNewMess(165, 38);
		subject.notifyObservers();
	}

}
