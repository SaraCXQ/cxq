package com.cn;

import java.io.UnsupportedEncodingException;

public class test3 {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	//��ȡ���ַ���UniCodeBlock
    boolean ischletter(char ch)
    {
    	Character.UnicodeBlock ub = Character.UnicodeBlock.of(ch);
        //  GENERAL_PUNCTUATION �ж����ĵġ���  
        //  CJK_SYMBOLS_AND_PUNCTUATION �ж����ĵġ���  
        //  HALFWIDTH_AND_FULLWIDTH_FORMS �ж����ĵģ��� 
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
		String str = new String("s�Ŀ���");
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
		System.out.print("�����ַ��ĸ���Ϊ "+ chnumber + "\n");
		System.out.print("Ӣ���ַ��ĸ���Ϊ " + letternumber + "\n");
		System.out.print("�����ַ��ĸ���Ϊ " + number + "\n");
	
	}

}

