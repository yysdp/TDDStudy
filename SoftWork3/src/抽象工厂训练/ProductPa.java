package 抽象工厂训练;

public class ProductPa extends product {

	@Override
	public Drug getDrug() {
		// TODO Auto-generated method stub
		return new Paracetamol();
	}

}
