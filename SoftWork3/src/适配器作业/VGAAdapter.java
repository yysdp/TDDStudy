package 适配器作业;
import 适配器作业.VGA;

public class VGAAdapter implements VGA{
	HDMI hdmi;
	public VGAAdapter(HDMI hdmi) {
		this.hdmi=hdmi;
	}
	@Override
	public void connect() {
		hdmi.connect();
		
	}
}
