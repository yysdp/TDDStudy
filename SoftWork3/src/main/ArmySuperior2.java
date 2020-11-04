package main;

public class ArmySuperior2 {
	
	
	Command command; // 用来存放具体命令的引用
	
	int age;
	int height;
	int weight;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void startExecuteCommand() {
		// 让具体命令执行execute()方法
		command.execute();
	}

}
