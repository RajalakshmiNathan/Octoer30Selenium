package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,4,5,6,7,2,3,4,5};
		List<Integer> l = new ArrayList<Integer>();
//		Set<Integer> duplicates = new LinkedHashSet<Integer>(l);
//		System.out.println(duplicates);
		
		for(Integer number:arr) {
			l.add(number);
		}
		
		for(int i = 0; i<l.size()-2;i++) {
			for(int j=i+1; j<l.size()-1; j++) {
				if((l.get(i)).equals(l.get(j))) {
					System.out.println("Duplicate elements:"+ l.get(i));
				}
			}
		}
	}

}
