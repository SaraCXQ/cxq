package com.cn;

import java.io.UnsupportedEncodingException;

public class test3 {

	/**
	 * @param args
	 */
	static int split(byte[] b, int number)
	{
		boolean flag = false;
		int num = 0;
		for(int i = 0; i < number; i++)
		{
			if(b[i] < 0 && !flag)
			{
				flag = true;
			}else{
				num ++;
				flag = false;
			}
		}
		return num;
		
	}
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
          String str = "q我爱wer第三方开始了的附件234234";
          int num = split(str.getBytes("GBK"),3);
          System.out.println(num);
          System.out.println(str.substring(0,num));
	}
	

}
