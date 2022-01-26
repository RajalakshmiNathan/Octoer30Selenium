package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer data[]= {3,2,11,4,6,7};
		List<Integer> arrList = new ArrayList();
		arrList = Arrays.asList(data);
		Collections.sort(arrList);
		System.out.println("Sorted list:"+arrList);
		int secondLargestLoc = arrList.size() -1;
		System.out.println("Second largest:"+arrList.get(secondLargestLoc-1) );

	}

}
