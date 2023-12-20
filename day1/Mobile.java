package week1.day1;

public class Mobile {
	public void makeCall()
	{
		String mobileModel = "Oppo";
		float mobileWeight = 96.2f;
		System.out.println("Model :"+ mobileModel);
		System.out.println("Weight :"+ mobileWeight);
		
	}
	public void sendSms()
	{
		boolean isfullCharged = true;
		int mobileCost = 12000;
		System.out.println("Charged :"+ isfullCharged );
		System.out.println("Cost :"+ mobileCost);
	}
	
	

	public static void main(String[] args) {
		Mobile obj = new Mobile();
		System.out.println("This is my mobile");
		obj.makeCall();
		obj.sendSms();
		

	}

}
