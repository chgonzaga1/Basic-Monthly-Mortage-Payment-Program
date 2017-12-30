package monthlymortgagePay;

//A monthly mortgage program by Christian Gonzaga
import java.util.Scanner;
import java.lang.Math;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class mainMMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//the variables for the user to prompt the input
		double anualInterestRate;
		int numYearsMortgage;
		int amountBorrowed;
		
		//initalizing the "scan" from Scanner class.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello,Welcome the Christian's Monthly Mortgage Program");
		System.out.println("Please state your annual interest rate below, "
				+ "please include the decimal. Ex) 0.05 = 5%");
		anualInterestRate = scan.nextDouble();
		
		System.out.println("Please state the number of years below that your mortgage will"
				+ "be held from your borrowed bank.");
		numYearsMortgage = scan.nextInt();
		
		System.out.print("Execllent, now please state your ammount of money that was "
				+ "borrowed from your bank.");
		amountBorrowed = scan.nextInt();
		
		
		//caculating the monthly payment;
		
		//variables for calculating the monthly payment.
		//mIR stands for monthly interest rate. 		
		double mIR = anualInterestRate/12;
		
		double b = 1 + mIR;
		double a =  Math.pow(b,(12*numYearsMortgage));
		
		double top = mIR * amountBorrowed;
		double bottom = (1 -(1/(a)));

		double monthlyPayment = top/bottom;
		
	//Displaying the mortgage summary
		
	//Initalizing the percentFormat by NumberFormat	
	NumberFormat percentFormat = NumberFormat.getPercentInstance();	
	
	NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
	

	
	
	System.out.println("Your anual interest rate is: " 
	+percentFormat.format(anualInterestRate));
	
	System.out.println("Your mortgage ammount is: " +priceFormat.format(amountBorrowed));
	
	
	DecimalFormat pricePattern = new DecimalFormat("$0.00");
	System.out.println("Your monthly payment is " +pricePattern.format(monthlyPayment));
	
	//Calculating the totalpayment
	//12 because there are 12 months in a year...then multiply it by numofYears that
	//the customer borrorwed
	double totalPayment = (monthlyPayment*12)*numYearsMortgage;
	
	System.out.println("Your total payment is: "+priceFormat.format(totalPayment));

	double overPayment = totalPayment - amountBorrowed;
	
	System.out.println("Your overpayment is "+priceFormat.format(overPayment));
	System.out.println("In percentage of the overment is "+ percentFormat.format(overPayment));
	
	
	
		
		

	}

}
