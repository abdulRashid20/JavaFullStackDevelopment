package consuleaApp;

public abstract class Display extends FileHandler {
	private String author = "Abdul Rashid Abu";
	private String appName = "LockedMe.com";
	private String email = "info@LockedMe.com";
	private String phoneNumber = "+233202004920";
	
	public Display() {

	}
	
	public abstract void changeFontColor ();

	public void WelcomeMsg() {
		System.out.println("             |----------------------------------------|");
		System.out.println("             |         Welcome to "+appName+"        |");
		System.out.println("             |         -----------------------        |");
		System.out.println("             |         Author: "+author+"         |");
		System.out.println("             |         Email: "+email+"         |");
		System.out.println("             |         Phone: "+phoneNumber+"        |");
		System.out.println("             |----------------------------------------|");
	}
	
	public void displayMainMenu() {
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("Main Menu");
		System.out.println("------------------------------");
		System.out.println("1. Enter 1 to list files in the directory");
		System.out.println("2. Enter 2 to add, search or delete a file");
		System.out.println("3. Enter 3 close app");
//		System.out.println("9. Always enter 9 to go back to previous prompt");
		System.out.println("--------------------------------------------------------");
		System.out.println("");
	}
	
	public void displayBusinessOpsMenu() {
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("Business-Level Operations");
		System.out.println("------------------------------");
		System.out.println("1. Enter 1 to add a file");
		System.out.println("2. Enter 2 to search a file");
		System.out.println("3. Enter 3 delete a file");
		System.out.println("9. Enter 9 to go back to previous prompt");
		System.out.println("--------------------------------------------------------");
		System.out.println("");
	}
	
	public void displayFiles() throws InterruptedException {
		for(byte i=0; i < super.listFiles().length; i++ ) {
			System.out.println((i+1)+". "+super.listFiles()[i]);
			Thread.sleep(20);
		}	
	}
		
	@Override
	public String toString() {
		return "";
	}		
}
