package com.cn;

public class test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Letter letter = new Letter("s我饿的34东方闪电",4);
         letter.split(4);
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
	@SuppressWarnings("null")
	public int[] findch(String str)
	{
		char arr[] = str.toCharArray();
		
		int position[] = new int[arr.length];
		int j = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(ischletter(arr[i]))
			{
				position[j] = i;
				j++;
			}
		}
		return position;
	}

	public void split(int number)
	{
		int sum =0 ;
		int sum1;
		char arr[] = str.toCharArray();
		int position[] = findch(str);
		int j = 0;
		int i = 0;
		int flag = 0;
		for ( i = 0; i < position.length; i++)
		{
			if(number == (position[i] + 2))
			{
				j = position[i];
				flag = 1;
			}				
			
		}
		if(flag == 0)
		{
			j = number;
			for(int k = 0; k < j; k++)
			{
				System.out.print(arr[k]);
			}
		}
		
		if(flag ==  1)
		{
			for(int k = 0; k <= j; k++)
			{
				System.out.print(arr[k]);
			}
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