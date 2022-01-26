package week1.day2;

public class MyMobile {

	String brandName ;
	String IMEI = "123424654657867";
	int resolution;
	float size;
	boolean isTouchScreen = true;
	short costMobile=12000;
	
	public String printBrandName (String brName)
	{
		System.out.println("BrandName:"+brName);
		return brName;
	}
	
	public void makeCalls()
	{
		System.out.println("Make calls");
	}
	
	private int printCost()
	{
		return costMobile;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMobile mob= new MyMobile();
		mob.makeCalls();
		mob.printBrandName("Apple");
		int pcost = mob.printCost();
		System.out.println("cost of mobile"+ pcost);
	}

}
