package main;

public class ArmySuperior2 {
	
	
	Command command; // ������ž������������
	
	int age;
	int height;
	int weight;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void startExecuteCommand() {
		// �þ�������ִ��execute()����
		command.execute();
	}

}
