package com.cn;

public class test16 {

	/**
	 * @param args
	 */
	public void hanoi(int n,char origin, char assist,char destination) {
		if(n==1) {
			move(origin, destination);
		}else {
			//首先将n-1个从A移动到B上
			hanoi(n-1, origin, destination, assist);
			//然后将n从A移动到C
			move(origin, destination);
			//最后将n-1从B移动到C上
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
