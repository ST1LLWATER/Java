import java.util.Scanner;

public class CylinderCalculator {

        public static void main(String args[])
        {
            Scanner inp = new Scanner(System.in);
            double a,l,r,v;
            System.out.print("Enter The Radius in Cm:");
            r = inp.nextDouble();
            System.out.print("\nEnter The Length in Cm:");
            l = inp.nextDouble();
            a = r * r * 3.14;
            v = a * l;
            System.out.printf("\nThe Area Is: %f cm2", a);
            System.out.printf("\nThe Volume Is: %f cm3", v);
        }
}
