package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> values = new ArrayList<String>();
		for (String eachData : input) {
		values.add(eachData);		
		}
		Collections.sort(values);
		System.out.println(values);

	}

}
