// class A{
//     int a=10;
  
// }
// class B extends A{
//     int a=20;
//     void show(){
//         System.out.printf("value of a is"+a);
//     }
   
// }

//  class test {
//   public static void main(String[] args) {
//     B obj=new B();
//     obj.show();
//   }  
// }

// ************************if i use superkeyword for variable
// class A{
//     int a=10;
  
// }
// class B extends A{
//     int a=20;
//     void show(){
//         System.out.printf("value of a is"+super.a);
//     }
   
// }

//  class test {
//   public static void main(String[] args) {
//     B obj=new B();
//     obj.show();
//   }  
// }
// *************************super keyword for function
// class A{
//   void show(){
//     System.out.println("heya");
//   }
  
// }
// class B extends A{
   
//     void show(){
//         super.show();
//         System.out.printf("value");
//     }
   
// }

//  class test {
//   public static void main(String[] args) {
//     B obj=new B();
//     obj.show();
//   }  
// }

//********************************** */ super keyword for  default constructor
// class A{
//     A()
//     {
//         System.out.println("hi goddie");
//     }
// }
// class B extends A{
//     B()
//     {
//         super();
//         System.out.println("heya shushi");
//     }
// }
// class test{
//     public static void main(String[] args) {
//         B obj=new B();
//     }
// }


// ****************************************super keyword for  parametrized constructor
class A{
    A(int a)
    {
        System.out.println("hi goddie"+a);
    }
}
class B extends A{
    B()
    {
        super(100);
        System.out.println("heya shushi");
    }
}
class test{
    public static void main(String[] args) {
        B obj=new B();
    }
}