import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int x,y,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        x = sc.nextInt();
        y = sc.nextInt();
        sum = x+y;
        System.out.println("Sum is "+sum);
    }
}