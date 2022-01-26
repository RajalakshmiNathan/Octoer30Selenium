package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "we learn java basics as a part of java sessions in java week1";
		String[] split = str.split(" ");
		
		Set<String> hashset = new LinkedHashSet<String>();
		
		for (String newsentence : split) {
			hashset.add(newsentence);
		}
		
		System.out.println(hashset);
	}

}
