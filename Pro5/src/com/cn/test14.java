package com.cn;

public class test14 {

	/**
	 * @param args
	 */
	//����һ������A���ҳ�һ�� (i, j)ʹ��A[i] <= A[j] (i < j)����j-i���
	public int[] maxDis(int A[]) {
		int maxDis[] = {0,-1,-1};
		for(int i = 0; i < A.length; i++) {
			for(int j = (i+1); j < A.length; j++) {
				if(A[i] < A[j]) {
					if(maxDis[0] < (j-i)) {
						maxDis[0] = j-i;
						maxDis[1] = i;
						maxDis[2] = j;
					}
					
				}
			}
		}
		return maxDis;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int A[] = {6,5,3,4,5,6};
         test14 test = new test14();
         int nun[] = test.maxDis(A);
         System.out.print(nun[0]+ " " + nun[1] + " " + nun[2]);
	}

}
