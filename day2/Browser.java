package week1.day2;

public class Browser {
	public String launchBrowser (String browserName) {
		System.out.println("Browser launched sucessfully");
		return "chrome";
	}
	public void loadUrl() {
		System.out.println("Application url loaded sucessfully");
	}
public static void main(String[] args) {
	Browser obj= new Browser();
	obj.launchBrowser("chrome");
	obj.loadUrl();
	System.out.println();
	
}
}

