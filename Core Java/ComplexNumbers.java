import java.util.Scanner;

class Complex{
    private float real;
    private float imaginary;

    Complex(){
        this.real = 1.0f;
        this.imaginary = 1.0f;
    }

    Complex(float real, float imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(Complex n1, Complex n2){
        Complex sum = new Complex(0.0f , 0.0f);
        sum.real = n1.real + n2.real;
        sum.imaginary = n1.imaginary + n2.imaginary;
        System.out.print(sum.real +" + "+ sum.imaginary +" * i");
    }
    public void subtract(Complex n1, Complex n2){
        Complex difference = new Complex(0.0f , 0.0f);
        difference.real = n2.real - n1.real;
        difference.imaginary = n2.imaginary - n1.imaginary;
        System.out.print(difference.real +" + "+ difference.imaginary +" * i ");
    }
    public void print(Complex n1){
        System.out.print("("+ n1.real +","+ n1.imaginary +")");
    }

}

class ComplexTester{
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        float real;
        float imaginary;
        System.out.print("Enter The Real Value Of Complex Number n1 :");
        real = inp.nextFloat();
        System.out.print("\nEnter The Imaginary Value Of Complex Number n1 :");
        imaginary = inp.nextFloat();
        Complex n1 = new Complex(real, imaginary);
        Complex n2 = new Complex();
        Complex sum = new Complex();
        Complex difference = new Complex();
        System.out.print("\nThe Value of n1 is :");
        n1.print(n1);
        System.out.print("\nThe Value of n2 is :");
        n2.print(n2);
        System.out.print("\nThe Sum of The Two Complex Numbers is :");
        sum.add(n1, n2);
        System.out.print("\nThe Difference of The Two Complex Numbers is :");
        difference.subtract(n1, n2);
    }
}