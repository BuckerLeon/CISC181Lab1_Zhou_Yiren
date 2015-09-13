package Lab1;

import org.apache.poi.ss.formula.functions.FinanceLib;
import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args){
		double r;
		double n;
		double y;
		double p;
		double f;
		boolean t;
		
		Scanner user_input = new Scanner(System.in);
		
		/*a is required income */
		System.out.println("Please input your required income:");
		int a = user_input.nextInt();
				
		/*b is mounthly SSI */
		System.out.println("Please input your monthly SSI:");
		int b = user_input.nextInt();
		
		/*c is annual return for PV*/
		System.out.println("Please input your annual return(%) for PV:");
		float c = user_input.nextInt();
		
		/*d is years retired*/
		System.out.println("Please input your years retired:");
		int d = user_input.nextInt();
		
		double PV;
		r = ((c/100)/12);
		n = d * 12;
		y = a - b;
		f = 0;
		t = false;
		
		PV = FinanceLib.pv(r,n,y,f,t);

		System.out.print("You need to save ");
		System.out.printf("%2.2f",-PV);
		System.out.print(" dollar.");
		
		Scanner user_input2 = new Scanner(System.in);
		
		/*e is the annual return for PMT*/
		System.out.println("Pleace input your annual return(%) for PMT:");
		float e = user_input.nextInt();
		
		/*h is the years of work*/
		System.out.println("Please input your years to work:");
		int h = user_input.nextInt();
		
		double PMT;
		r = ((e/100)/12);
		n = h*12;
		p = 0;
		f = PV;
		t = false;
		
		PMT = FinanceLib.pmt(r, n, p, f, t);
		
		System.out.print("You need to save ");
		System.out.printf("%2.2f",PMT);
		System.out.print(" dollar each mounth.");
	}

}
