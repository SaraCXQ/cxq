package com.cn;

public class test12 {

	/**
	 * @param args
	 */
	private static final char[] datas = new char[] {'��','Ҽ','��','��','��','��','½','��','��','��'};
	private static final char[] units = new char[]{'Ԫ','ʰ','��','Ǫ','��','ʰ','��','Ǫ','��'};
	
	public void convert(int data) {
		int j = 0;
		int k = 0;
		String str = "";
		
		while(data != 0) {
			int i = data % 10;
			data = data / 10;
			str += units[j]+""+ datas[i];
			System.out.print(datas[i]+ ""+ units[j]);
			++j;
			++k;
		}
		System.out.println();
		String rev = reverse3(str);
		System.out.print(rev);
		
	}
	//�ַ�����ת1�����ַ����ں���������
	public String reverse1(String str) {
		int length = str.length();
		String rev = "";
		for(int i = 0; i < length; i++) {
			rev =  str.charAt(i) + rev ;
		}
		return rev;
	}
	//�ַ�����ת2�����õݹ�
	public String reverse2(String str) {
		if(str.length() <= 1) {
			return str;
		}
		String left = str.substring(0, str.length()/2);
		String right = str.substring(str.length()/2, str.length());
		return reverse2(right) + reverse2(left);
	}
	//����StringBuffer�е�reverse����
	public String reverse3(String str) {
		return new StringBuffer(str).reverse().toString();
	}
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
           test12 test = new test12();
           test.convert(202340);
	}

}
