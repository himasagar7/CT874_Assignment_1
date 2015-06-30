package Assignment_1;

import java.util.Scanner;

/*
 * Java program that computes the total sales of a concert 
 */
public class Concert {

	public static void main(String[] args) {
		
		//Declare variable
		int a_count,b_count,c_count;
		double c_price,total_sales;
		Scanner s = new Scanner(System.in);
		
		/*
		 * There are three types of seats available: A, B and C. 
		 * Read the number of tickets sold and the price of a ticket for each of the three types of seats
		 */
		
		System.out.println("Enter number of A seats sold:");
		 a_count = s.nextInt();
		System.out.println("Enter price of A tickets");
		double a_price = s.nextDouble();
		System.out.println("Enter number of B seats sold:");
		 b_count = s.nextInt();
		System.out.println("Enter price of B tickets");
		double b_price = s.nextDouble();
		System.out.println("Enter number of c seats sold:");
		 c_count = s.nextInt();
		System.out.println("Enter price of c tickets");
		
		
		// Calculating the total sales
		 c_price = s.nextDouble();
		 total_sales= a_count*a_price + b_count*b_price + c_count*c_price;
		
		//Print the values
		System.out.printf("%30s","               Tickets Sold            Price Per Ticket\n");
		System.out.printf("%10s","              ---------------         -------------------\n");
		System.out.printf( "%s%10d%30.2f\n","A Tickets: ",a_count,a_price);
		System.out.printf( "%s%10d%30.2f\n","B Tickets: ",b_count,b_price);
		System.out.printf( "%s%10d%30.2f\n","C Tickets: ",c_count,c_price);
		System.out.printf( "%40s%3.2f\n","Total Sales €  ",total_sales);
		
		s.close();
		
	}

}
