// we can access private from default method
// interface A{
//      default void call(){
// add(20,10);
//      }
//     private void add(int x,int y){
//         System.out.println("sum is "+(x+y));
//     }
// }
// class B implements A{
//   public void sub(int x,int y){
//         System.out.println("sub is "+(x-y));
//     }
// }
// class test{
//     public static void main(String[] args) {
//         B obj1=new B();
//         obj1.call();
//         obj1.sub(5,4);
       
//     }
// }
// // we can  also access private from static  method
interface A{
     public static void call(){
add(20,10);
    }
   private static void add(int x,int y){
       System.out.println("sum is "+(x+y));
   }
}
class B implements A{
 public void sub(int x,int y){
       System.out.println("sub is "+(x-y));
   }
}
class test{
   public static void main(String[] args) {
       B obj1=new B();
       A.call();
       obj1.sub(5,4);
      
   }
}
