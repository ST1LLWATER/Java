import com.sun.jndi.ldap.sasl.SaslInputStream;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int x=inp.nextInt();
        if(x<5){
            System.out.println("IT IS LESS");
        }
        else if(x<10) {
            System.out.println("It Is Greater then 5 less then 10");
        }
    }
}
