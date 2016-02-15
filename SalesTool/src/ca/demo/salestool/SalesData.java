package ca.demo.salestool;

public class SalesData {
	
	int data[] = {0,4,40};
	
	
	public void display() {
		
		System.out.println("Data: ");
		
		for(int i=0; i< data.length; i++){
			System.out.println("display next value " + data[i]);
		}
	}
	
	

}
