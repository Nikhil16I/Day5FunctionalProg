import java.util.Scanner;

public class Quadratic {
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
  System.out.print("Input Value for 'a' = ");
	     int a = num.nextInt();
	System.out.println();
		
 System.out.print("Input Value for 'b' = ");
	     int b = num.nextInt();
	System.out.println();
		
 System.out.print("Input Value for 'c' = ");
	     int c = num.nextInt();
	System.out.println();	
	
	
System.out.println(" Roots of Eqn are =");
System.out.println();
		double D =  (Math.pow(b, 2) - (4 * a * c));
          //R1=Root 1 of X, R2=Root 2 of X		
double R1 = (-b + Math.sqrt(D)/(2*a));
double R2 = (-b - Math.sqrt(D)/(2*a));

		System.out.println("Root 1 = " + R1);
System.out.println();
		System.out.println("Root 2 = " + R2);
 }

}
