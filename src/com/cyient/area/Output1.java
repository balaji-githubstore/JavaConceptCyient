package com.cyient.area;

class Output {
	int a;
	int b;

	void meth(int i, int j) {
		i++;
		j++;
	}
}

public class Output1 {
	public static void main(String args[]) {
		Output obj = new Output();
		int a = 10;
		int b = 20;
		obj.meth(a, b);
		System.out.println(a + " " + b);
	}
}

//public class Output1 {
//	public static void main(String args[]) {
//		int i = 1;
//		String j="2"; 
//		System.out.println(i+j);
//		
//	}
//}



