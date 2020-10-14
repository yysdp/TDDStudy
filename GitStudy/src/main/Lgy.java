package main;

import java.util.ArrayList;

public class Lgy {
void out(ArrayList arr) {
	 int max=(int) arr.get(0);  
	 int min=(int) arr.get(0);
	 
	 for(int i =0;i<arr.size();i++){
		 if(min>(int)arr.get(i)) min = (int)arr.get(i);
		 if(max<(int)arr.get(i)) max = (int)arr.get(i);
	 }
	 System.out.println("max为"+max+"\n"+"min为"+min);
	}

}
