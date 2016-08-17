package com.cn;

public class test11 {

	/**
	 * @param args
	 */
	public void reverse(int reverseBefore[]) {
		for(int i = 0; i <= ((reverseBefore.length/2) - 1); i++) {
			int temp = reverseBefore[i];
			reverseBefore[i] = reverseBefore[reverseBefore.length - 1 - i];
			reverseBefore[reverseBefore.length - 1 - i] = temp;	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverseBefore[] = {1,2,3,4,5,6,7};
        test11 test = new test11();
        test.reverse(reverseBefore);
        for(int i = 0; i < reverseBefore.length; i++) {
        	System.out.print(reverseBefore[i]);
        }
	}

}
