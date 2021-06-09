package com.cyient.loops;

public class ForLoopTest {

	public static void main(String[] args) throws InterruptedException {

		// 1 to 10
//		for (int i = 1; i <= 10; i = i + 1) 
//		{
//			System.out.println(i);
//		}
		int[] numbers = {10,20,30,40,50,60,80,55,42,8,64,25,35};	
		int size = numbers.length;
		System.out.println(size);	
		//print numbers less than or equal 50 from the array
		
		for(int i=0;i<size;i++)
		{
//			Thread.sleep(1000);
			if(numbers[i]==40)
			{
				System.out.println("value is present"+numbers[i]);
//				break;//stop the further iteration
			}
			
		
		}

	}

}
