package com.cn;

public class test16 {

	/**
	 * @param args
	 */
	public void hanoi(int n,char origin, char assist,char destination) {
		if(n==1) {
			move(origin, destination);
		}else {
			//���Ƚ�n-1����A�ƶ���B��
			hanoi(n-1, origin, destination, assist);
			//Ȼ��n��A�ƶ���C
			move(origin, destination);
			//���n-1��B�ƶ���C��
			hanoi(n-1, assist, origin, destination);
		}	
	}
	
	private void move(char origin, char destination) {
		System.out.println("Direction:" + origin + "--->"+ destination);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     test16 hanoi = new test16();
         hanoi.hanoi(3,'A','B','C');
	}

}
