package work;

public class CommandSXT implements Command {

	Dianqi dianqi;
	public CommandSXT(Dianqi dianqi){
	      this.dianqi=dianqi;
	   }
	
	@Override
	public void Close() {
		// TODO Auto-generated method stub
		dianqi.close();
		
	}
	@Override
	public void Open() {
		// TODO Auto-generated method stub
		dianqi.open();
		
	}
	

}
