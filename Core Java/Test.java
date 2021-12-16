class A {
  int a=5;

 void display() {
    System.out.println(a);
  }
}
class B extends A{
  int b,c;

  public B(){
      this.b=4;
      this.c=6;
  }

  void Display() {
    // System.out.println(this.b);
    int S = (a + b + c) / 3;
    System.out.println(S);
  }
}

class Test{
  public static void main(String[] args) {
      B obj = new B();
    //   obj.display();
      obj.Display();
  }
}