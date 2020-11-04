package 抽象工厂训练;

public abstract class product {
	product(){
		System.out.println("药品"+getDrug().name+"的成分是"+getDrug().chengfen);
	}
	 public abstract Drug getDrug(); //工厂方法


}
