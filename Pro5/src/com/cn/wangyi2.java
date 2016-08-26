package com.cn;

import java.util.Scanner;

public class wangyi2 {

	/**
	 * @param args
	 */
	public static boolean find(int number[],int num) {
		for(int i = 0; i < number.length; i++) {
			if(num == number[i])
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int numSum = sc.nextInt();
        int []number = new int[numSum];
        int index = 0;
        while( sc.hasNext() && index < numSum ) {
        	number[index] = sc.nextInt();
        	index ++;
        }
        String s = sc.nextLine();
       
        int count = 0;
        for(int i = 0 ;i < number.length; i++) {
        	for(int j = (i+1); j < number.length; j++) {
        		int  temp = number[i]^number[j];
        		if(wangyi2.find(number, temp)) {
        			++count;
        		}
        		
        	}
        }
        System.out.print(number.length - count);
        
        
	}

}
