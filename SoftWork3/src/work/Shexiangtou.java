package work;

public class Shexiangtou implements Dianqi{

	@Override
	public void close() {
		System.out.println("摄像头关闭");
	}

	@Override
	public void open() {
		System.out.println("摄像头打开");
		
	}

}
