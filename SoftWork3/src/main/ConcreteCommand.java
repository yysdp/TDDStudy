package main;

public class ConcreteCommand implements Command {

	CompanyArmy army;           //���н����ߵ�����
	public ConcreteCommand(CompanyArmy army){
	      this.army=army;
	   }

	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		army.sneakAttack();     

	}

}
