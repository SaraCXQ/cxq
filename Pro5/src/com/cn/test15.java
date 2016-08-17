package com.cn;

public class test15 {

	/**
	 * @param args
	 */
	//��ͨ���ֲ��ҷ�
	//����һ�����򣨷ǽ�������A��������һ��iʹ��A[i]����target���������򷵻�-1
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
	//����һ�����򣨷ǽ�������A���ɺ����ظ�Ԫ�أ�����С��iʹ��A[i]����target���������򷵻�-1
	
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
	//����һ�����򣨷ǽ�������A���ɺ����ظ�Ԫ�أ�������iʹ��A[i]����target���������򷵻�-1
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
	//����һ�����򣨷ǽ�������A���ɺ����ظ�Ԫ�أ�����С��iʹ��A[i]����target���������򷵻�-1
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
	//. ����һ�����򣨷ǽ�������A���ɺ����ظ�Ԫ�أ�������iʹ��A[i]����target���������򷵻�-1
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
	//����һ�����򣨷ǽ�������A���ɺ����ظ�Ԫ�أ���target�������г��ֵĴ�����
	//(��������֮ǰд�ĺ����������һ�γ��ֵ�λ�ã�Ȼ��������һ�γ��ֵ�λ�ã�����λ�������Ϊ���ֵĴ���
	
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
