package com.cn;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class test6 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        BufferedReader fi = new BufferedReader(new FileReader("company.txt"));
        String newlines = null;
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>(); 
       
        while(( newlines = fi.readLine())!= null) {
        	String s[] = newlines.split("£¬");
        	Integer findvalue = hashmap.get(s[1]);
        	if(null == findvalue) {
        		hashmap.put(s[1], 1);
        	} else {
        		int num = findvalue;
        		hashmap.put(s[1],num+1);
        	}
        	
        } 
        
        List<Map.Entry<String, Integer>> infoIds = new ArrayList<Map.Entry<String,Integer>>(hashmap.entrySet());
        Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {
        	public int compare(Map.Entry<String, Integer> first, Map.Entry<String, Integer> second) {
        		return second.getValue() - first.getValue();
        	}
        	
        });
        
        for(int i = 0; i < infoIds.size(); i++)
        {
        	String id = infoIds.get(i).toString();
        	System.out.println(id);
        }
              
	}
}
