package org.system;

public class DeskTop extends Computer {

	public void desktopSize() {
		
		System.out.println("size of desktop : 24 inches");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeskTop dTop = new DeskTop();
		dTop.computerModel();//calling from parent using single inheritance
		dTop.desktopSize();//child class method
	}

}
