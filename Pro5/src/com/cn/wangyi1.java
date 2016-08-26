package com.cn;

import java.util.Scanner;
import java.util.Stack;

//public class Main {
//    public void xipai(String number1) {
//    	char number[] = number1.toCharArray();
//        Stack s1 = new Stack();
//        Stack s2 = new Stack();
//        for(int i = 0; i < number.length/2; i++) {
//            s1.push(number[i]);
//        }
//        for(int i = (number.length/2); i < number.length; i++) {
//            s2.push(number[i]);
//        }
//        while((!s2.isEmpty()) && (!s1.isEmpty())) {
//            System.out.print(s2.pop() + " " + s1.pop());
//        }
//    }
//    public  static void main(String []args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int i = 1;
//        Main t = new Main();
//        while(i <= num) {
//            System.out.println(num + " " + i );
//            String number1 = sc.next();
//            t.xipai(number1);
//            ++i;
//        }
//        
//    }
//}

public class wangyi1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int number[] = new int[num];
		for(int i = 0; i < num; i++) {
			number[i] = i+1;
		}
		for( int j = (num - 2 ); j >= 0; j--) {
			int temp = number[num - 1];
			int k = 0;
			while(k < (num - 1 - j)) {
				number[num - 1 - k] = number[num - 1 - k - 1];
				k++;
			}
			number[j] = temp;
		}
		
		for(int i = 0; i < num; i++) {
			System.out.print(number[i]);
		}
			
	}
		
}


//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int groups = sc.nextInt();
//        while (groups-- > 0){
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            int[] res = new int[2*n];
//            for(int i=0;i<2*n;i++){
//                int tmp = i + 1;
//                for(int j = 0; j < k;j++){
//                    if (tmp <= n) tmp = 2*tmp - 1;
//                    else tmp = 2 * (tmp - n);
//                }
//                res[tmp - 1]=sc.nextInt();
//            }
//             //Êä³ö
//            if(res.length> 0) System.out.print(res[0]);
//            for(int i = 1;i< 2*n;i++){
//                System.out.print(" "+res[i]);
//            }
//            System.out.println();
//        }
//    }
//}
