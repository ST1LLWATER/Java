import java.util.Scanner;

class Rectangle{
    double width;
    double height;

    Rectangle()
    {
        width = 1;
        height = 1;
    }

    Rectangle(double w, double h)
    {
        this.width = w;
        this.height = h;
    }

    void setWidth(double width)
    {
        this.width = width;
    }

    double getWidth()
    {
        return(this.width);
    }

    void setHeight(double height)
    {
        this.height = height;
    }

    double getHeight()
    {
        return(this.height);
    }

    double getPerimeter()
    {
        return(2 * (height + width));
    }

    double getArea()
    {
        return(width * height);
    }
}

class RectangleTester{
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        double W, H, Ar, Per;
        System.out.print("Enter The Width of the Rectangle r2:");
        W = inp.nextDouble();
        System.out.print("\nEnter The Height of the Rectangle r2:");
        H = inp.nextDouble();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(W,H);

        System.out.print("\nThe Perimeter of r1 is " + r1.getPerimeter() + " and the Area is " + r1.getArea());
        System.out.print("\nThe Perimeter of r2 is " + r2.getPerimeter() + " and the Area is " + r2.getArea());
    }
}
