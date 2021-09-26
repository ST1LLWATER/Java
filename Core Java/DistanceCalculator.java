import java.util.Scanner;
import java.lang.Math;

    class DistanceCalculator {
        public static void main(String args[]) {
            Scanner inp = new Scanner(System.in);
            double x1, y1, x2, y2, Dist;
            System.out.print("Enter Value for x1 in Point 1 (x1,y1) :");
            x1 = inp.nextDouble();
            System.out.print("\nEnter Value for y1 in Point 1 (x1,y1) :");
            y1 = inp.nextDouble();
            System.out.print("\nEnter Value for x2 in Point 2 (x2,y2) :");
            x2 = inp.nextDouble();
            System.out.print("\nEnter Value for y2 in Point 2 (x2,y2) :");
            y2 = inp.nextDouble();
            Dist = Math.pow((((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))), 0.5);
            System.out.printf("\nDistance Between the Points : %f units", Dist);
        }
    }

