package 适配器作业;

public class OldComputer implements VGA{

	String name;
	OldComputer(){
       name="旧电脑";
    }
	OldComputer(String s){
       name=s;
    }
   
    public void turnOn(){
       System.out.println(name+"VGA,连接");
    }

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		turnOn();
		
	}

}
