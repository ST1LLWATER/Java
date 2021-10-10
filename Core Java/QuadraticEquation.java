import java.util.*;
import java.lang.Math;


class QuadraticEquation {
    private int a,b,c;

    QuadraticEquation(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public int getCoeffA(){
        return a;
    }

    public int getCoeffB(){
        return b;
    }

    public int getCoeffC(){
        return c;
    }

    public int getDiscriminant(){
        return ((b*b)-(4*a*c));
    }

    public double getRoot1(){
        if(getDiscriminant()<0){
            return 0;
        }else {
            return ((-b + Math.sqrt(getDiscriminant())) / 2 * a);
        }
    }

    public double getRoot2(){
        if(getDiscriminant()<0){
            return 0;
        }else {
            return ((-b - Math.sqrt(getDiscriminant())) / 2 * a);
        }
    }
}

class QuadraticEquationTester{
    public static void main(String[] args) {
        QuadraticEquation eq1=new QuadraticEquation(1,-2,-15);
        System.out.printf("A:%d B:%d C:%d",eq1.getCoeffA(),eq1.getCoeffB(),eq1.getCoeffC());
        System.out.println("\nDiscriminant: "+eq1.getDiscriminant());
        System.out.println("Root 1: "+eq1.getRoot1());
        System.out.println("Root 2: "+eq1.getRoot2());
    }
}
