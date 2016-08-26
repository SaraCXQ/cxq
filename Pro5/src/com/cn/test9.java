package com.cn;

import java.util.Vector;

public class test9 {

	/**
	 * @param args1,4,6,2,3,9,1
	 */
	public void bulleSort(int sortBefore[]) {
		for(int i = 0; i < sortBefore.length - 1; i++) {
			for(int j = (i+1); j < sortBefore.length; j++) {
				if(sortBefore[i]> sortBefore[j]) {
					int temp = sortBefore[i];
					sortBefore[i] = sortBefore[j];
					sortBefore[j] = temp;
				}
			}
		}
	}
	public void selectSort(int sortBefore[]) {
		for(int i = 0; i < sortBefore.length - 1; i++) {
			int minPosition = i;
			for(int k = (i + 1); k < sortBefore.length; k++) {
				if(sortBefore[k] < sortBefore[minPosition])
				{
					minPosition = k;
				}
			}
			if(minPosition != i ) {
				int temp = sortBefore[i];
				sortBefore[i] = sortBefore[minPosition];
				sortBefore[minPosition] = temp;
			}
		}
	}
	public void quickSort(int sortBefore[], int left, int right) {	
		if(left < right)
		{
			int position = partition(sortBefore,left,right);
			quickSort(sortBefore, 0, position - 1);
			quickSort(sortBefore, position + 1, right);
		}
	
	}
	public int partition(int sortBefore[],int left, int right) {
		int temp = sortBefore[left];
		int i = left;
		int j = right;
		while(i < j) {
			while(i < j && sortBefore[j] > temp) {
				if(temp + sortBefore[j] == 5 ) {
					System.out.println("两个数相等的为"+ temp + " " + sortBefore[j]);
				}
				j--;
			}
			if(i < j ) {
				if(sortBefore[i] + sortBefore[j] == 5 ) {
					System.out.println("两个数相等的为"+ sortBefore[i] + " " + sortBefore[j]);
				}
				sortBefore[i++] = sortBefore[j];
			}
			while(i < j && sortBefore[i] < temp) {
				if(temp + sortBefore[i] == 5 ) {
					System.out.println("两个数相等的为"+ temp + " " + sortBefore[i]);
				}
				i++;
			}
			if(i < j)
			{
				if(sortBefore[i] + sortBefore[j] == 5 ) {
					System.out.println("两个数相等的为"+ sortBefore[i] + " " + sortBefore[j]);
				}
				sortBefore[j--] = sortBefore[i];
			}
		}
		sortBefore[i]=temp;
		return i;
	}
	
	public void mergeSort(int sort[], int start, int end) {
		if(start < end) {
			int mid = (start + end)/2;
			mergeSort(sort, start, mid);
			mergeSort(sort, mid + 1, end);
			merge(sort,start,mid,end);
		}
	
	}
	public void merge(int sort[], int start,int mid, int end) {
		int i = start;
		int j = mid + 1;
		int length = end - start + 1;
		int temp[] = new int[length];
		int k = 0;
		while(i <= mid && j <= end) {
			if(sort[i] < sort[j]) {
				temp[k] = sort[i];
				++k;
				++i;
			}else if(sort[j] < sort[i]){
				temp[k] = sort[j];
				++k;
				++j;
			}else {
				//如果需要找出两个集合的相等元素，则需要加个else比较，如果相等输出
				//如果不需要，只是普通的合并排序，则需要在第一个if中加个等号，去掉最后一个else
				System.out.println("相等的数据为"+ sort[i]);
				temp[k] = sort[i];
				i++;
				k++;
			}
		}
		while(i <= mid) {
			temp[k] = sort[i];
			++k;
			++i;
		}
		while(j <= end) {
			temp[k] = sort[j];
			++k;
			++j;
		}
		int n =start;
		for(int m = 0; m < k; m++,n++) {
			sort[n] = temp[m];
		}
	}
	public void insertSort(int sortBefore[]) {
		for(int i = 1; i < sortBefore.length; i++) {
			int temp = sortBefore[i];
			int j ;
			for( j = i-1; j >= 0; j--) {
				if(sortBefore[j] >= temp) {
					sortBefore[j + 1] = sortBefore[j];
				}else {
					break;
				}
			}
			sortBefore[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test9 test = new test9();
        int sortBefore[ ] = {1,4,6,2,3,9,1};
        test.quickSort(sortBefore, 0, 6);
        test.bulleSort(sortBefore);
        test.selectSort(sortBefore);
        test.mergeSort(sortBefore,0,6);
        //test.merge(sortBefore, 0, 3, 6);
        
        test.insertSort(sortBefore);
        for(int i = 0; i < sortBefore.length; i++)
        {
        	System.out.print(sortBefore[i]);
        }
	}

}
