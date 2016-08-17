package com.cn;

public class test10 {

	/**
	 * @param args
	 */
	public int countAge(int number)
	{
		
		if(number == 1)
		{
			return 10;
			//System.out.println(age);
		}else{
			return countAge(number-1) + 2;
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         test10 test = new test10();
         System.out.print(test.countAge(8));
	}

}
