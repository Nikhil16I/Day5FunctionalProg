import java.util.Scanner;

public class IntDistinctTriplet  {
		public static void main(String[] args) {
			Scanner num = new Scanner(System.in);

			System.out.print(" Input an N inetger = ");
			int n = num.nextInt();

			int [] arr = new int[n];

			for (int i = 0; i < n; i++) {
	System.out.print(" Enter the Element of Nth value " + (i + 1) + " Value  = ");
				arr[i] = num.nextInt();
			}

		for (int i = 0; i < n - 2; i++) {
			
		for (int j = i + 1; j < n; j++) {
		
		for (int k = j + 1; k < n; k++) {
	  if (arr[i] + arr[j] + arr[k] == 0) {
	
System.out.println(" Integers " + arr[i] + ", " + arr[j] + ", " + arr[k] + " Added to 0");
	}
     }
   }
  }
 }
}
