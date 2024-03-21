// functional interface have only one method
// @FunctionalInterface
interface A{
    void show();
}
// class B extends object implements A{
//     public void show(){
//         System.out.println("in B");
//     }
// }
class test{
    public static void main(String[] args) {
        A obj=()->System.out.println("in test");
    
        obj.show();
    }
}