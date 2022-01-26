package week3.day1;

public class MyPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sPhone = new SmartPhone();
		sPhone.sendMsg();  //From Mobile
		sPhone.makeCall(); //from Mobile
		sPhone.saveContact();//from Mobile
		
		sPhone.takeVideo(); 
		
		sPhone.connectWhatsapp();//from Smart phone 
	}

}
