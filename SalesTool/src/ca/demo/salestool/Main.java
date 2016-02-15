package ca.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();

	}
	
   private static void displayGreeting() {
		
		System.out.println("hello happy sales people");
		System.out.println("this app shows sales data");
		System.out.println("----------------------");
		System.out.println("Test 1");
		System.out.println("Test 2");
	}

}
