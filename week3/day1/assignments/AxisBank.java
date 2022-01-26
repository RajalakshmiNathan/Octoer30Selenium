package week3.day1.assignments;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("deposits 10%");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank aBank = new AxisBank();
		//executes from parent class
		aBank.saving();
		aBank.fixed();
		//executes overridden method
		aBank.deposit();
	}

}
