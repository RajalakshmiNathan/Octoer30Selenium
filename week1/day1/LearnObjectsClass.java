package week1.day1;

public class LearnObjectsClass {

	String objCategory = "MobilePhone";
	float size;
	String shape;
	String IMEI;
	char brandName;
	byte weight;
	boolean isTouchScreen;
	
	public void viewGallery()
	{
		System.out.println("viewing gallery");
	}
	
	public void makecalls() {
		// TODO Auto-generated method stub
		System.out.println("make calls");
	}
	
	public void printBrandName() {
		// TODO Auto-generated method stub
		System.out.println("brandname:"+brandName);
	}
	public void printWeight() {
		// TODO Auto-generated method stub
		System.out.println("weight:"+weight);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnObjectsClass Apple = new LearnObjectsClass();
		Apple.brandName = 'A';
		Apple.IMEI="1234567891234567";
		Apple.isTouchScreen = false;
		Apple.weight = 3;
		Apple.makecalls();
		Apple.printBrandName();
		Apple.printWeight();
	}

}
