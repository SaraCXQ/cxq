package com.cn;

public class test8 {

	/**
	 * @param args
	 */
	
	public void computeAdd(int d) {
		System.out.println(d);
		if(d < 5000)
		{
			 computeAdd(d * 2);	
		} 
		System.out.println(d);
		
	}
//	public void computeSubstract(int num)
//	{
//		System.out.println(num);
//		length--;
//		while(length > 0)
//		{
//			computeSubstract(num/2);
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         test8 test = new test8();
          test.computeAdd(1237);
         //test.computeSubstract(num);
	}

}
