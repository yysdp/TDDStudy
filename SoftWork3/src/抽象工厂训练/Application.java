package 抽象工厂训练;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product pro = new ProductAm();
		Drug am = pro.getDrug();
		
		pro = new ProductPa();
		Drug pa = pro.getDrug();
		

	}

}
