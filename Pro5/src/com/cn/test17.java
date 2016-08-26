package com.cn;

public class test17 {

	/**
	 * @param args
	 */
	public void generator1(int a,int b, int num) {
		int N = 0;
		int i = 1;
		while(N < num) {
			if( i % a == 0 || i % b == 0) {
				System.out.print(i+" ");
				N++;
			}
			i++;
		}
		
	}
	public void generator2(int a, int b, int num) {
		int N = 0;
		int x = a;
		int y = b;
		while(N < num) {
			if(x == y) {
				N++;
				System.out.print(x+ " ");
				x = x + a;
				y = y + b;	
			}else if(x < y) {
				N++;
				System.out.print(x+ " ");
				x = x + a;
			}else {
				N++;
				System.out.print(y+ " ");
				y = y + b;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         test17 test = new test17();
         test.generator2(2, 3, 5);
	}

}
