class Super{
    int count=0;
    int add(){
        return(count+10);
    }
}

class Sub extends Super{
    int add(){
        return(count+20);
    }
}

class Test{
    public static void main(String[] args){
        Super s=new Sub();
        System.out.println(s.add());
    }
}
