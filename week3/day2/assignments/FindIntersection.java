package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer arr1[] = {3,2,11,4,6,7};
		Integer arr2[] = {1,2,8,4,9,7};
		List<Integer> num3 = new ArrayList<Integer>();
		List<Integer> num4 = new ArrayList<Integer>();
		
		num3.addAll(Arrays.asList(arr1));
		num4.addAll(Arrays.asList(arr2));
		num4.retainAll(num3);
		
		System.out.println("intersection values:"+num4);
//		for (int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(arr1[i]== arr2[j]) {
//					arrList.add(arr1[i]);
//				}
//			}
//		}
//		
//		System.out.println(arrList);
		}

}
