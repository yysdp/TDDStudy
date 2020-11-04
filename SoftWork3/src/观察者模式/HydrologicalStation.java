package 观察者模式;

import java.util.ArrayList;

public class HydrologicalStation implements Subject {
	float flow, Speed;
	boolean changed;
	ArrayList<Observer> personList;

	HydrologicalStation() {
		personList = new ArrayList<Observer>();
		flow = 100;
		Speed = 50;
		changed = false;
	}

	public void addObserver(Observer o) {
		if (!(personList.contains(o)))
			personList.add(o);
	}

	public void deleteObserver(Observer o) {
		if (personList.contains(o))
			personList.remove(o);
	}

	public void notifyObservers() {
		if (changed) {
			for (int i = 0; i < personList.size(); i++) {
				Observer observer = personList.get(i);
				observer.hearTelephone(flow,Speed);
			}
			changed = false;
		}
	}

	public void giveNewMess(float flow,float speed) {
		if (this.flow==flow && this.Speed==speed)
			changed = false;
		else {
			this.flow=flow;
			this.Speed=speed;
			changed = true;
		}
	}

}
