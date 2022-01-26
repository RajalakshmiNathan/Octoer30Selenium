package week3.day1.assignments;

public class CompareOneStringToOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="I am Learning Java" ;
		String str2="I am learning java";
		if(str1==str2) {
			System.out.println("Strings are equal using == ");
		}
		else if (str1.equals(str2)) {
			System.out.println("Strings are equal - using equals keyword");
		}
		else {
			System.out.println("Strings are equal - using equalsIgnoreCase keyword");
		}
			
		

	}

}
