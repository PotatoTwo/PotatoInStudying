package day1;

import java.util.Arrays;

import studyService.QueryService;
import studyService.impl.QueryServiceImpl;
import util.StudyQueryUtil;

public class QueryStudyRun {
	

	public static void main(String[] args) {
		int[] arr1 = {1,3,4,6,3,2,43,12,554,34,12,54,65,44,3};
		int[] arr2 = {32,44,123,545,2321,343,12,43,1,23,4,5,3};
		
		QueryService queryService = new QueryServiceImpl();
		queryService.bubbleSort(arr1);
		//1.8新提供的排序函数
		Arrays.parallelSort(arr1);
		System.out.println(Arrays.toString(StudyQueryUtil.reverseMyArr(arr1)));
		
		int[] arr3 = queryService.combineAndSort(arr1, arr2);
		System.out.println(Arrays.toString(arr3));
	}

}
