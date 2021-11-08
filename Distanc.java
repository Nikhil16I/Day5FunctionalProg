import java.util.Scanner;

public class Distanc {
        public static void main(String[] args) {

                Scanner num = new Scanner(System.in);

           System.out.println("Enter Value for X  = ");
             int X = num.nextInt();

           System.out.println("Enter Value for Y  = ");
             int Y = num.nextInt();

                
System.out.println();//SPACE                
           double Distance=Math.sqrt((X*X) +(Y*Y));

                System.out.println("Distance from(0,0) to  " + X +"  and  "+ Y +"  is:  " +Distance+ " Units ");
   }
        
}
