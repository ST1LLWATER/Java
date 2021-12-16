class Book{
    private String name;
    private String author;
    private int qty;
    private double Wprice;

    Book(String name,String author,int qty,int Wprice){
        this.name=name;
        this.author=author;
        this.qty=qty;
        this.Wprice=Wprice;
    }

    String getName(){
        return this.name;
    }

    String getAuthor(){
        return this.author;
    }

    int getQty(){
        return this.qty;
    }

    double getWprice(){
        return this.Wprice;
    }

    
    void setName(String name){
        this.name=name;
    }

    void setAuthor(String author){
        this.author=author;
    }

    void setQty(int qty){
        this.qty=qty;
    }

    void setWprice(double Wprice){
        this.Wprice=Wprice;
    }

    double getRPrice(){
        return 0.15*Wprice;
    }

    public String toString(){
        return "Name: "+name+"\nAuthor: "+author+"\nQuantity: "+qty+"\nWholesale Price: "+Wprice+"\nRetail Price: "+getRPrice();
    }

}

class BookTester{
    public static void main(String[] args){
        Book obj=new Book("Harry Potter","J K Rowlin",120,500);
        System.out.println(obj);
        obj.setName("Harry Puttar");
        obj.setAuthor("J K Growlin");
        obj.setQty(240);
        obj.setWprice(1000);
        System.out.println("\nName: "+obj.getName()+"\nAuthor: "+obj.getAuthor()+"\nQuantity: "+obj.getQty()+"\nWholesale Price: "+obj.getWprice()+"\nRetail Price: "+obj.getRPrice());
    }
}