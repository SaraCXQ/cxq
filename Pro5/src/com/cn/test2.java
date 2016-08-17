package com.cn;

import java.io.*;

public class test2 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        File srcFile = new File("java");
        if(!(srcFile.exists()) && srcFile.isDirectory())
        {
        	throw new Exception("目录不存在");
        }
        File[] files = srcFile.listFiles(
        		new FilenameFilter()
        		{
        			public boolean accept(File dir,String name)
    				{
    					
    					return name.endsWith(".java");
    				}
        		}
       );
        
        File desFile = new File("jad");
        if(!desFile.exists())
        {
        	desFile.mkdir();
        }
        
        for(int i = 0; i < files.length; i++)
        {
        	FileInputStream srcfiles = new FileInputStream(files[i]);
        	String destFileName = files[i].getName().replaceAll("\\.java$", ".jad");
        	//复制目录下的文件，并不复制文件内容
        	FileOutputStream  desfiles = new FileOutputStream(new File(desFile,destFileName));
        	byte[] b = new byte[1024];
        	int len = 0;
        	//复制文件中内容
        	if((len = srcfiles.read(b))!= -1)
        	{
        		desfiles.write(b,0,len);
        	}
        	
        	desfiles.close();
        	        	
        }     			
 }
}
