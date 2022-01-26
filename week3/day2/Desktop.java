package week3.day2;

public class Desktop implements HardWare,Software{

	public void desktopModel() {
		System.out.println("Desktop model - lenovo");
	}
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software sources");
		
	}
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware sources");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop dt = new Desktop();
		dt.hardwareResources();
		dt.softwareResources();
		dt.desktopModel();
	}
	

}
