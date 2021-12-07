class GeometricObject{
    String Color;
    Boolean filled;

    GeometricObject(String C){
        this.Color = C;
        setIsFilled();
    }

    GeometricObject(){
        this.Color = "none";
        this.filled = false;
    }

    void setColor(String C){
        this.Color = C;
        setIsFilled();
    }

    String getColor(){
        return Color;
    }

    void setIsFilled(){
        this.filled=true;
    }

    boolean getIsFilled(){
        return filled;
    }

    void ToString(boolean F){
        if(F == true)
            System.out.println("It is Filled");
        else
            System.out.println("It is not Filled");
    }
}
class Circle extends GeometricObject{
    private int Radius;

    Circle(int R){
        this.Radius = R;
    }

    int getRadius(){
        return Radius;
    }

    void setRadius(int R){
        this.Radius = R;
    }

    void getArea(int R){
        System.out.println("The Area of the Circle is"+ 3.14*R*R);
    }

    void getPerimeter(int R){
        System.out.println("The Perimeter of the Circle is"+ 3.14*2*R);
    }
    void getDiameter(int R){
        System.out.println("The Diameter is"+ 2*R);
    }

    @Override
    void ToString(boolean F){
        if(F == true)
            System.out.println("It is Filled");
        else
            System.out.println("It is not Filled");
    }
}
class Rectangle extends GeometricObject{
    private int Length;
    private int Breadth;

    Rectangle(int L, int B){
        this.Length = L;
        this.Breadth = B;
    }

    void setLength(int L){
        this.Length = L;
    }

    void setBreadth(int B){
        this.Breadth = B;
    }

    int getLength(){
        return Length;
    }

    int getBreadth(){
        return Breadth;
    }

    void getArea(int L, int B){
        System.out.println("The Area of the Rectangle is"+ L*B);
    }

    void getPerimeter(int L, int B){
        System.out.println("The Perimeter of the Rectangle is"+2*(L+B));
    }

    @Override
    void ToString(boolean F){
        if(F == true)
            System.out.println("It is Filled");
        else
            System.out.println("It is not Filled");
    }
}
class GeometryInheritence{
    public static void main(String args[]) {
//        GeometricObject G1 = new GeometricObject("Red");
        Circle C1 = new Circle(5);
//        Rectangle R3=new Rectangle("Green");
//        R3.ToString(R3.getIsFilled());
        C1.setColor("Green");
        C1.ToString(C1.getIsFilled());
        Rectangle R1 = new Rectangle(6,6);
        System.out.print(C1.getColor());

    }
}