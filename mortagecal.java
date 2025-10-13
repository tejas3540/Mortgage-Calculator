package mortagecalculator;
import java.util.*;
import java.math.*;
import java.text.NumberFormat;
public class mortagecal {
	public static void main(String [] args) {
		final byte month_in_year = 12;
		final byte persentage = 100;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Principle:");
		int principle = sc.nextInt();
	
		System.out.print("Annual Interest rate:");
		float AnnualInterestrate = sc.nextFloat();
		float monthlyinterest = AnnualInterestrate /persentage /month_in_year ;	
		
		System.out.print("Period(Years):");
		int period = sc.nextInt();
		int numberofpayments = period * month_in_year;
		
		double	Mortage = principle * (monthlyinterest * Math.pow(1+ monthlyinterest, numberofpayments))
										/ (Math.pow(1+monthlyinterest, numberofpayments)-1) ;
		String MortageFormatted = NumberFormat.getCurrencyInstance().format(Mortage);
		System.out.println("Mortage:" +MortageFormatted);
	}
}
