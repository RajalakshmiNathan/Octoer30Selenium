package week3.day2;

public class College extends University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College clg = new College();
		clg.ug();
		clg.pg();

	}

	@Override
	public void ug() {
		// TODO Auto-generated method stub
		System.out.println("has UG");
	}

}
