package studyService.impl;

import java.util.Arrays;
import java.util.TreeSet;

import studyService.QueryService;
import util.StudyQueryUtil;

public class QueryServiceImpl implements QueryService {

	/**
	 * 冒泡排序
	 */
	@Override
	public void bubbleSort(int[] arr) {
		if (arr != null && arr.length > 0) {
			int len = arr.length;
			for (int i = len - 1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					if (arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
		}
		else {
			System.out.println("arr is null or length is 0");//can think about using log4j
		}
	}

	/**
	 * 连接数组，并去重，且从小到大排序
	 */
	@Override
	public int[] combineAndSort(int[] arr1, int[] arr2) {
		Integer[] comArr = StudyQueryUtil.combineArr(arr1, arr2);
		//利用TreeSet可以实现去重和排序
		TreeSet<Integer> tree = new TreeSet<Integer>(Arrays.asList(comArr));
		Integer[] resultSet = tree.toArray(new Integer[] {});
		int[] resultArr = new int[resultSet.length];
		for (int i = 0; i < resultSet.length; i++) {
			resultArr[i] = resultSet[i].intValue();
		}
		return resultArr;
	}
	

}
