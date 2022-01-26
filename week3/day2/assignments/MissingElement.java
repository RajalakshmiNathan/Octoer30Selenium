package week3.day2.assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer data[] = {1,2,3,4,5,7,8};
		List<Integer> arrlist = new ArrayList<Integer>();
		for(int num : data) {
			arrlist.add(num);
		}
		
		for(int i=0;i<arrlist.size()-1;i++) {
			//System.out.println(arrlist.get(i));
			if((i+1)!=arrlist.get(i)) {
				System.out.println("MISSING ELEMENT:"+(i+1));
				break;
			}
		}
	}

}
