package util;

import java.util.Arrays;

public class StudyQueryUtil {

	/**
	 * 连接两个数组
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static Integer[] combineArr(int[] arr1, int[] arr2) {
		int length = arr1.length + arr2.length;
		int[] result = Arrays.copyOf(arr1, length);
		System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
		System.out.println("Result array is:" + Arrays.toString(result));
		return changeArrIntToInteger(result);
		
	}
	
	/**
	 * 实现int类型数组转为Integer类型数组
	 * @param src
	 * @return
	 */
	public static Integer[] changeArrIntToInteger(int[] src) {
		Integer[] result = null;
		if (src != null && src.length > 0) {
			result = new Integer[src.length];
			for (int i = 0; i < src.length; i++) {
				result[i] = Integer.valueOf(src[i]);
			}
		}
		return result;
	}
	
	/**
	 * 实现反转数组
	 * @param arr
	 * @return
	 */
	public static int[] reverseMyArr(int[] arr) {
		if (arr == null || arr.length == 0) {
			return arr;
		}
		int[] result = new int[arr.length];
		for (int i = arr.length ; i > 0; i--) {
			result[arr.length-i] = arr[i-1];
		}
		return result;
	}
	
}
