package 适配器作业;

public class NewComputer implements HDMI{

	String name;
	NewComputer(){
       name="新电脑";
    }
	NewComputer(String s){
       name=s;
    }
   
    public void turnOn(){
       System.out.println(name+"HDMI,连接");
    }

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		turnOn();
		
	}
}
