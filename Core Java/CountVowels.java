import java.io.*;
import java.util.*;
import java.lang.*;

public class CountVowels{
    public static void Count(File a)throws Exception{
        FileInputStream in=new FileInputStream(a);

        int n;
        int vCount=0;

        while((n=in.read())!=-1){
            char c=(char)n;

            switch(c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                vCount++;
                break;
            }
        }

        in.close();

        System.out.println("Vowels Are: "+vCount);
    }

    public static void main(String[] args)throws Exception{
        File count=new File("copySource");
        Count(count);
    }

}