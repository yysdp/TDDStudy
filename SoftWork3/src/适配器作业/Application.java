package 适配器作业;

public class Application {
	public static void main(String[] args) {
		VGA vga;
		
		OldComputer oldComputer = new OldComputer();
		vga = oldComputer;
		vga.connect();
		
		NewComputer newComputer = new NewComputer();
		VGAAdapter adapter = new VGAAdapter(newComputer);
		
		vga = adapter;
		vga.connect();
	
	}
	
}
