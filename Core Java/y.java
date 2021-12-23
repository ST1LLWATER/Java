import java.util.*;
class x
{
    int a,b,c;
    int add(int a,int b)
    {
        this.a=a;
        this.b=b;
        c=a+b;
        return c;
    }
}
class a
{
    public static void main(String[] args)
    {
        x d=new x();
        System.out.println(d.add(1,5));
    }
}