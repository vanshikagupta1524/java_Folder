// static block called only once for n no of objects
class A{
    String brand;
    int price;
     static String name;
     static{
name="phone";
System.out.println("in static block");
     }
     public A (){
        price=5;
        brand="gg";
        System.out.println("constructor called");

     }
}
class test{
    public static void main(String[] args) {
        A obj1=new A();
        obj1.brand="hehe";
        obj1.price=5;
        A.name="smartphone";
        A obj2=new A();
        obj2.brand="he";
        obj2.price=15;
    }
}