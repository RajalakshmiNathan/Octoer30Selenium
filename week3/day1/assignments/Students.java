package week3.day1.assignments;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("ID:"+id);
	}
	
	public void getStudentInfo(int id, String Name) {
		System.out.println("ID:"+id+" Name:"+Name);
	}
	
	public void getStudentInfo(String email, String phone) {
		System.out.println("email:"+email+" Phone:"+phone);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students student1 = new Students();
		student1.getStudentInfo(100);
		student1.getStudentInfo(100, "Raji");
		student1.getStudentInfo("aaa@gmail.com", "9876543212");
	}

}
