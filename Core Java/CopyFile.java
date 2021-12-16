import java.util.*;
import java.io.*;

public class CopyFile{
    public static void copyFile(File a,File b)throws Exception{
        FileInputStream in=new FileInputStream(a);
        Scanner sc=new Scanner(a);
        FileOutputStream out=new FileOutputStream(b);
        int size=1;
        String str="";
        int i=0;
        int n;
          while((n=in.read()) != -1){
                char ch=(char)n;
                // char test=(char)0;
                if (ch== ' '){
                    size++;
                }
            }
            int[] data=new int[size];
        // for(i=0;i<5;i++){
        //     data[i]=i;
        // }
       
            while(sc.hasNextInt()){
                data[i++]=sc.nextInt();
            }

            Arrays.sort(data);

            // for(int x=0;x<data.length;x++){
            //     for(int y=x;y<data.length;y++){
            //         if (data[x]>data[y]){
            //             int temp=data[x];
            //             data[x]=data[y];
            //             data[y]=temp;
            //         }
            //     }
            // }

            // for(i=0;i<data.length;i++){
            //     str+=data[i]+" ";
            // }
            str=Arrays.toString(data);
            System.out.println(str);

        out.write(str.getBytes());

  
            if(in!=null){
                in.close();
            }
            if(out!=null){
                out.close();
            }
       
        System.out.println("Copy SuccessFul xD"); 
    }

    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);

        // if(args.length < 2){
        //     System.out.println("Arguments Dedo Saar");
        //     System.exit(0);
        // }

        System.out.println("Enter Source: ");
        String source=sc.nextLine();

        System.out.println("Enter Destination: ");
        String destination=sc.nextLine();

        File src=new File(source);
        File dest=new File(destination);

        copyFile(src,dest);
    }

}