 import java.util.Scanner;

    class BodyMassIndex{
        public static void main (String args[])
        {
            Scanner inp = new Scanner(System.in);
            double W, H, BMI;
            System.out.print("Enter Weight in Pound:");
            W = inp.nextDouble();
            System.out.print("\nEnter Height in Inches:");
            H = inp.nextDouble();
            BMI = (W * 0.45359237) / ((H * 0.0254) * (H * 0.0254));
            System.out.printf("\nThe Body Mass Index = %f Kg/m2", BMI);
        }
    }

