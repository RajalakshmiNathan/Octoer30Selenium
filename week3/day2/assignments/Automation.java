package week3.day2.assignments;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation auto1 = new Automation();
		auto1.java();
		auto1.ruby();
		auto1.python();
		auto1.Selenium();
		

	}

	public void Selenium() {
		// TODO Auto-generated method stub
		
		System.out.println("This is selenium class");
		
	}

	public void java() {
		// TODO Auto-generated method stub
		
		System.out.println("This is java method");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("This is ruby method	");
	}

}
