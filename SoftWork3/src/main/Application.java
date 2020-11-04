package main;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompanyArmy sanlian = new CompanyArmy();
		Command command = new ConcreteCommand(sanlian);
		
		//SpyCompanyArmy spy = new SpyCompanyArmy();
		//Command command2 = new ConcreteCommandSpy(spy);
		
		ArmySuperior zhihui= new ArmySuperior();
		
		
	
		
		
		//zhihui.setCommand(command2);
		//zhihui.startExecuteCommand();
		
		zhihui.setCommand(command);
		zhihui.startExecuteCommand();
		
		
//		
//		ArmySuperior2 ָ�ӹ�2 = new ArmySuperior2();
//		ָ�ӹ�2.setCommand(command);
//		ָ�ӹ�2.startExecuteCommand();
		
		

	}

}
