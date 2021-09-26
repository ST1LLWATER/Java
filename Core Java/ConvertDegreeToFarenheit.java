import java.util.Scanner;

public class ConvertDegreeToFarenheit {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        double c;
        System.out.print("Enter The value In Celsius:");
        c = inp.nextDouble();
        double f = ((9 *c)/ 5)+32;
        System.out.printf("The Coverted Temperature Is: %f", f);
    }
}
