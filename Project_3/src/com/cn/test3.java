package com.cn;

import java.io.UnsupportedEncodingException;

public class test3 {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	//获取此字符的UniCodeBlock
    boolean ischletter(char ch)
    {
    	Character.UnicodeBlock ub = Character.UnicodeBlock.of(ch);
        //  GENERAL_PUNCTUATION 判断中文的“号  
        //  CJK_SYMBOLS_AND_PUNCTUATION 判断中文的。号  
        //  HALFWIDTH_AND_FULLWIDTH_FORMS 判断中文的，号 
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS 
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B 
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS 
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
               return true;
           
        }
        return false;
    }
	
   
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		int chnumber = 0;
		int letternumber = 0;
		int number = 0;
		test3 test = new test3();
		String str = new String("s的看法");
		char arr1[] = str.toCharArray();
		for(int i =0; i < arr1.length; i++)
		{
			if (arr1[i] <= 'z' && arr1[i] >= 'a')
			{
				letternumber++;
			}else if (arr1[i] >= 0 && arr1[i] <= 9)
			{
				number ++;
			}else if(test.ischletter(arr1[i]))
			{
				chnumber ++;
			}
			
		}
		System.out.print("中文字符的个数为 "+ chnumber + "\n");
		System.out.print("英文字符的个数为 " + letternumber + "\n");
		System.out.print("数字字符的个数为 " + number + "\n");
	
	}

}

