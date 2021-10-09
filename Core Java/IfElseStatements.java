import com.sun.jndi.ldap.sasl.SaslInputStream;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        if ((x >= 16) ? true : ((x < 10) ? true : false)) {
            System.out.println("Accepted");
        } else {
            System.out.println("Nope");
        }
    }
}
