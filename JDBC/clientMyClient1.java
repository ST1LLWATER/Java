import java.net.*;
import java.io.*;

public class clientMyClient1{
   public static void main(String[] args)throws Exception{
   Socket s=new Socket("localhost",3000);
   DataInputStream din=new DataInputStream(s.getInputStream());
   DataOutputStream dout=new DataOutputStream(s.getOutputStream());
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

   String str1="",str2="";
   while(!str1.equals("stop")){
     str1=br.readLine();
     dout.writeUTF(str1);
     str2=din.readUTF();
     System.out.println("Server Said: "+str2);
   
   }
 }
}