import java.util.Scanner;

class Inheritence{
    String name;

    void setName(String name){
        this.name=name;
    }


public static void main(String[] args){
    Inheritence b[]=new Inheritence[3];
        Scanner PersonName=new Scanner(System.in);
    int i;



    for(i=0;i<3;i++){
        b[i]=new Inheritence();
        System.out.println("Enter Name Of Person "+ (i+1));
        String name=PersonName.nextLine();
        b[i].setName(name);
    }

  for(i=0;i<3;i++){
      System.out.println("Person "+(i+1)+" Is Called: ");
           System.out.println(b[i].name);
    }

}

}