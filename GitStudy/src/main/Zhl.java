package main;

import java.util.ArrayList;

public class Zhl {
	void out(ArrayList arr) {
		for(int j=0; j<100; j=j+20)
		{
			int q=j+20;
			int count=0;
			for(int i=0; i<arr.size();i++)
			{
				if(Integer.parseInt(arr.get(i).toString())>=j &&Integer.parseInt(arr.get(i).toString())<q){
					count++;
				}
			}
			System.out.println("["+j+","+q+")区间:"+count+"个");
		}
	
		
	}

}
