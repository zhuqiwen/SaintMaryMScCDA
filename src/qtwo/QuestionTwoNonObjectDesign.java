package qtwo;


import java.util.Scanner;

public class QuestionTwoNonObjectDesign {

	public static void main(String[] args){
		System.out.println("yyohhoo");


		double priceCider = 5.5;
		double priceJuice = 4.5;

		Scanner sc = new Scanner(System.in);
		System.out.println("how many customers? ");

		int numCustomers = sc.nextInt();

		String[] customers = new String[numCustomers];
		int[] numAppleCider = new int[numCustomers];
		int[] numAppleJuice = new int[numCustomers];


		for(int i = 0; i < numCustomers; i++)
		{
			System.out.println("Enter the name of customer #" + (i + 1));
			customers[i] = sc.next();
			System.out.println("How many orders of cider did " + customers[i] + " have?");
			numAppleCider[i] = sc.nextInt();
			System.out.println("How many orders of juice did " + customers[i] + " have?");
			numAppleJuice[i] = sc.nextInt();
		}




	}





}
