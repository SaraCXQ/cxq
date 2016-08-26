package com.cn;

public class test18 {

	/**
	 * @param args
	 */
	public char[] movePosition(String s) {
		char ss[] = s.toCharArray();
		int i = 0;
		int j = 0;
		while(i < (ss.length - 1)){
			 j = i+1;
				if(Character.isUpperCase(ss[i]) && Character.isLowerCase(ss[j])) {
					int position1 = i;
					int position2 = i;
					while(position2 >= 0) {
						if(Character.isUpperCase(ss[position2])) {
							--position2;
					}else {
						break;
					}
					}
					if((position2 + 1)== i) {
						char temp = ss[i];
						ss[i] = ss[j];
						ss[j] = temp;
					}else {
						while(position1 >= position2) {
							char c = ss[position1 + 1];
							ss[position1 + 1] = ss[position1];
							ss[position1] = c;
							--position1;
							
						}
					}
				    
					i++;
				}else if(Character.isUpperCase(ss[i]) && Character.isUpperCase(ss[j])){
					int position1 = i;
					int position2 = j;
					while( position2 < ss.length) {
						if(Character.isUpperCase(ss[position2])) {
							++position2;
					}else{
						break;
					}
					}
				    if((position2 + 1) > ss.length) {
				    	break;
				    }else {
				    	i = position2 ;
				    	while((position2-position1 + 1) >=0) {
							char c = ss[position2 + 1];
							ss[position2 + 1] = ss[position2];
							ss[position2] = c;
							position2--;
						}
				    	
				    }
				
			}else{
				++i;
			}
		}
			
		return ss;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test18 test = new test18();
        String s = "AkCeiBCeilD";
        char c[] = test.movePosition(s);
        for(int i = 0; i < c.length; i++) {
        	System.out.print(c[i]);
        }
	}

}
