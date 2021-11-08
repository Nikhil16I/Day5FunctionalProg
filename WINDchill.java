import java.util.Scanner;

  public class WINDchill {
         public static void main(String[] args) {

                 Scanner scanner = new Scanner(System.in);

            //Temparature=T,WindSpeed=V, WindChill=C
                      double T,V,C;

                 System.out.println("Temperature");
                 System.out.println("Input  Temperature = ");

  T=scanner.nextDouble();System.out.println("*C");
System.out.println();
                 System.out.println("Windspeed");
                 System.out.println("Input WindSpeed = ");

  V=scanner.nextDouble(); System.out.println("m/s");


 C = (35.74 + 0.6215) * (T - 35.75) * Math.pow(V, 0.16) + (0.4275 * T) * Math.pow(V, 0.16);
System.out.println();
System.out.println("How well You feel cold  Windchill is");
                   System.out.println();
                 System.out.print("=" +C+ ".");

         }

}
