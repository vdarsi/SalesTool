package ca.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();

	}
	
   private static void displayGreeting() {
		
		System.out.println("HelloHappy sales people");
		System.out.println("This app shows sales data");
	}

}
