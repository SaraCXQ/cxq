package com.cn;

public class test15 {

	/**
	 * @param args
	 */
	//普通二分查找法
	//给定一个有序（非降序）数组A，求任意一个i使得A[i]等于target，不存在则返回-1
	public int search(int A[], int target) {
		int low = 0;
		int high = A.length - 1;
		while(low <= high) {
			int mid = low + ((high - low )>>1);
			if(A[mid] == target) {
				return mid;
			}else if(A[mid] < target) {
				low = mid + 1;
			}else{
				high = mid - 1;
			}
		}
		return -1;
	}
	//给定一个有序（非降序）数组A，可含有重复元素，求最小的i使得A[i]等于target，不存在则返回-1
	
	public int searchFirst(int A[], int target) {
		int low = 0;
		int high = A.length;
		while(low < high) {
			int mid = low + ((high - low)>>1);
			if(A[mid] < target) {
				low = mid + 1;
			}else {
				high = mid;
			}
		}
		if(A[high] != target) {
			return -1;
		}else {
			return low;
		}
	}
	//给定一个有序（非降序）数组A，可含有重复元素，求最大的i使得A[i]等于target，不存在则返回-1
	public int searchLastPosLessThan(int A[], int target) {
		int low = 0;
		int high = A.length;
		while(low < high) {
			int mid = low + ((high - low + 1)>>1);
			if(A[mid] < target) {
				low = mid;
			}else {
				high = mid - 1;
			}
		}
		return A[low] < target ? low : -1;
	}
	//给定一个有序（非降序）数组A，可含有重复元素，求最小的i使得A[i]大于target，不存在则返回-1
	public int searchFirstPosLessThan(int A[], int target) {
		int low = 0;
		int high = A.length;
		while(low < high) {
			int mid = low + ((high - low)>>1);
			if(A[mid] > target) {
				high = mid;
			}else {
				low = mid + 1;
			}
		}
		return A[high] > target ? high:-1;
	}
	//. 给定一个有序（非降序）数组A，可含有重复元素，求最大的i使得A[i]等于target，不存在则返回-1
	public int searchLast(int A[], int target) {
		int low = 0; 
		int high = A.length - 1;
		while(low < high) {
			int mid = low + ((high - low + 1)>>1);
			if(A[mid] > target) {
				high = mid - 1;
			}else {
				low = mid;
			}
		}
		if(A[high] != target) {
			return -1;
		}else {
			return high;
		}
	}
	//给定一个有序（非降序）数组A，可含有重复元素，求target在数组中出现的次数。
	//(可以利用之前写的函数，求出第一次出现的位置，然后求出最后一次出现的位置，两个位置相减即为出现的次数
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int A[] = {1,4,5,7,9,12,24,56};
          int B[] = {1,3,4,5,5,5,5,8,9,12,23};
          test15 test = new test15();
          //test.search(A, 12);
          //test.searchFirst(B, 5);
          System.out.print(test.searchFirstPosLessThan(B, 5));
          
	}

}
