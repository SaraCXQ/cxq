package com.cn;

public class test7 {
	
	private test7() {	
	}
	private static test7 testSingle = null;
	public static test7 getInstance() {
		if(testSingle == null) {
			testSingle = new test7();
		}
		return testSingle;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test7 test = new test7();
        
	}

}
enum Test{
	INSTANCE;
	public static Test getInstance() {  
        return INSTANCE;  
    }  
  
    public void test() {  
        System.out.println("test");  
    }
}
class T{
	Test test= Test.INSTANCE;
	
}