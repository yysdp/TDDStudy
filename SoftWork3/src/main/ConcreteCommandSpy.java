package main;

public class ConcreteCommandSpy implements Command {

	SpyCompanyArmy army;           //含有接收者的引用
	public ConcreteCommandSpy(SpyCompanyArmy army){
	      this.army=army;
	   }

	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		army.spy();

	}

}
