package main;

public class ConcreteCommandSpy implements Command {

	SpyCompanyArmy army;           //���н����ߵ�����
	public ConcreteCommandSpy(SpyCompanyArmy army){
	      this.army=army;
	   }

	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		army.spy();

	}

}
