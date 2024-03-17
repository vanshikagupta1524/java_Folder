class A{
  void input(){
    System.out.println("hi i am vanshika");
  }  
}
class B extends A{
    void show(){
        System.out.println("hi i am sania");
    }
}
class C extends A{
    void display(){
        System.out.println("hi i am muskan");
    }
}
public class hierarchical {
public static void main(String[] args) {
    B obj=new B();
    C obj1=new C();
    obj.input();obj.show();
    obj1.input();obj1.display();
}   
}
