package com.cn;

public class test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Letter letter = new Letter("ss我饿的34东方闪电",0);
         letter.split(0);
	}

}

class Letter{
	private String str;
	private int number;
	Letter(String strs,int number){
		this.str = strs;
		this.number = number;
	}
	public boolean ischletter(char ch)
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

	public void split(int number)
	{
		int sum =0 ;
		int sum1;
		char arr[] = str.toCharArray();
		if (ischletter(arr[number]) )
		{
			sum = count(number);			
		}
		sum1 = (number * 2 - sum)/2;
		for(int i = 0; i < sum1; i++)
		{
			System.out.print(arr[i]);
		}
		
	}
	public int count(int number)
	{
		int sum = 0;
		char arr[] = str.toCharArray();
		for(int i = 0; i < number; i++)
		{
			if(ischletter(arr[i]))
			{
				sum++;
			}
		}
		return sum;
	}
}