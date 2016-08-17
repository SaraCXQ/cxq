package com.cn;

import java.io.*;

public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		BufferedWriter bw  = null;
		// TODO Auto-generated method stub
        try {
			br1 = new BufferedReader(new FileReader("a.txt"));
			br2 = new BufferedReader(new FileReader("b.txt"));
		    bw  = new BufferedWriter(new FileWriter("c.txt"));
			String s1 = null;
			String s2 = null;
			String s3 = null;
			while((s1 = br1.readLine())!= null)
			{
				System.out.println(s1);
				bw.write(s1);
				bw.newLine();
				if((s2 = br2.readLine())!= null);
				{
					System.out.println(s2);
					bw.write(s2);
					bw.newLine();
				}
				
			}
			while((s3 = br2.readLine())!= null)
			{
				System.out.print(s2);
				bw.write(s3);
				bw.newLine();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			bw.close();
		    br1.close();
		    br2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
        
	}

}
