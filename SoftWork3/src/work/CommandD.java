package work;

import main.CompanyArmy;

public class CommandD implements Command{

	Dianqi dianqi;
	public CommandD(Dianqi dianqi){
	      this.dianqi=dianqi;
	   }
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
