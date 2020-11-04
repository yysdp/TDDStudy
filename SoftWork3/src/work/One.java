package work;

public class One {
	Command command;
	
	public void close() {
		command.Close();
		
	}


	public void open() {
		command.Open();
		
	}


	public Command getCommand() {
		return command;
	}


	public void setCommand(Command command) {
		this.command = command;
	}
}
