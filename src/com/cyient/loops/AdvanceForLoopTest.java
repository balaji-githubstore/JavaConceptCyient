package com.cyient.loops;

public class AdvanceForLoopTest {

	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50,60,80,55,42,8,64,25,35};
		
		
		for(int number : numbers)
		{
			if(number<=50)
			{
				System.out.println(number);
			}
		}

		String[] colors= {"red","yellow","pink","green"};
		//write for each to print the values in array colors
		for(String x : colors)
		{
			System.out.println(x);
		}

	}

}
