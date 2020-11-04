package main;

public class ConcreteCommand implements Command {

	CompanyArmy army;           //含有接收者的引用
	public ConcreteCommand(CompanyArmy army){
	      this.army=army;
	   }

	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		army.sneakAttack();     

	}

}
