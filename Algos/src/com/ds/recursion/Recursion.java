package com.ds.recursion;


public class Recursion {

	public static void main(String[] args) {
		
		int result =0;
		
			try {
				 result = recursiveFactorial(100);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			System.out.println(result);
			
	}
	
	private static int recursiveFactorial(int num) {
		
		
		if(num == 0 ) {
			return 1;
		}
		
		return num * recursiveFactorial(num-1);
	}
}
