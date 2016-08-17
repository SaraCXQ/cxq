package com.cn;

public class test13 {

	/**
	 * @param args
	 */
	//一个数组，含有重复元素，求这两个数在数组中出现位置的最小距离
	public int minLength(int A[], int num1, int num2) {
		int minPosition1 = -1;
		int minPosition2 = -1;
		
		int mindis = 9999;
		for(int i = 0; i < A.length; i++) {
			if(A[i] == num1) {
				minPosition1 = i;
				if(minPosition2 >= 0) {
					mindis = Math.min(mindis, minPosition1 - minPosition2);
				}
			}
			if(A[i] == num2) {
				minPosition2 = i;
				if(minPosition1 >= 0) {
					mindis = Math.min(mindis, minPosition2 - minPosition1);
				}
			}
		}
		return mindis;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A[] = {1,2,3,4,5,6,7,8,9,7,6,5,4,9,4,3,2,2,1};
        test13 test = new test13();
        int dis = test.minLength(A, 9, 4);
        System.out.print(dis);
	}

}
