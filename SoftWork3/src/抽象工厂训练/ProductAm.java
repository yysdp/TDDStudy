package 抽象工厂训练;

public class ProductAm extends product {

	@Override
	public Drug getDrug() {
		// TODO Auto-generated method stub
		return new Amorolfine();
	}

}
