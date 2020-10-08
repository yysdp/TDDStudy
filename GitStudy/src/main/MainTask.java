package main;

import java.util.ArrayList;

public class MainTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList();
		arr.add(50);
		arr.add(60);
		arr.add(20);
		arr.add(90);
		arr.add(30);
		Zhl zhl = new Zhl();
		Ys ys = new Ys();
		Lgy lgy = new Lgy();
		Cyc cyc = new Cyc();
		zhl.out(arr);
		ys.out(arr);
		cyc.out(arr);
		lgy.out(arr);
		//1，对成绩进行排序
		//2，求平均分，
		//3，统计区间：0-20：xx个，21-40：xx个
		//4，最大值最小值
	}

}
