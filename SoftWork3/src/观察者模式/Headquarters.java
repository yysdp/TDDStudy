package 观察者模式;

public class Headquarters implements Observer{

	Subject subject; 
	Headquarters (Subject subject){
	      this.subject=subject;
	      subject.addObserver(this);     //使当前实例成为subject所引用的具体主题的观察者
	   }

	@Override
	public void hearTelephone(float flow, float speed) {
		// TODO Auto-generated method stub
		System.out.println("流量："+flow+" 流速："+speed);
		
	}

	
}
