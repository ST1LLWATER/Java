import java.util.*;


class splitSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String data=sc.nextLine();
        // String data="10 15 10";
        String[] num=data.split(" ",0);
        int sum=0;
        // int[] final=new int[num.length];
          for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
            sum+=Integer.parseInt(num[i]);
        }
        System.out.println("Sum Is: "+sum);

        // for(int i=0;i<num.length;i++){
        //     int temp=Integer.parseInt(data[i]);
        //     final[i]=temp;
        //     System.out.println(final[i]);
        // }
    }
}