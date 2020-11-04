package work;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dianqi deng = new Deng();		
		Command c1 = new CommandD(deng);		
		One one = new One();
		one.setCommand(c1);						
		one.open();
		one.close();
	
		
		Dianqi shexiangtou = new Shexiangtou();
		Two two = new Two();		
		Command c2 = new CommandSXT(shexiangtou);
		two.setCommand(c2);	
		two.open();
		two.close();	

	}

}
