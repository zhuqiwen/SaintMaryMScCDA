package qtwo;


import java.util.Scanner;
import java.util.jar.JarEntry;

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
		double[] appleCiderTotalPayPerPerson = new double[numCustomers];
		double[] appleJuiceTotalPayPerPerson = new double[numCustomers];
		double[] totalPayPerPerson = new double[numCustomers];


		int numCiderTotal = 0;
		int numJuiceTotal = 0;
		double ciderTotalPay = 0;
		double juiceTotalPay = 0;




		for(int i = 0; i < numCustomers; i++)
		{
			System.out.println("Enter the name of customer #" + (i + 1));
			customers[i] = sc.next();
			System.out.println("How many orders of cider did " + customers[i] + " have?");
			numAppleCider[i] = sc.nextInt();
			System.out.println("How many orders of juice did " + customers[i] + " have?");
			numAppleJuice[i] = sc.nextInt();

			numCiderTotal += numAppleCider[i];
			numJuiceTotal += numAppleJuice[i];

			appleCiderTotalPayPerPerson[i] = numAppleCider[i] * priceCider;
			appleJuiceTotalPayPerPerson[i] = numAppleJuice[i] * priceJuice;

			ciderTotalPay += appleCiderTotalPayPerPerson[i];
			juiceTotalPay += appleJuiceTotalPayPerPerson[i];

			totalPayPerPerson[i] = appleCiderTotalPayPerPerson[i] + appleJuiceTotalPayPerPerson[i];
		}




	}

	private static int calculateTotalNum(int[] numArray){

	}





}
