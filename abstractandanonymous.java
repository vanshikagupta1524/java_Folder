abstract class A{
abstract void show();
}
class test{
public static void main(String[] args) {
    A obj=new A(){
        public void show(){
            System.out.println("i am in test");
        }
    };
    obj.show();

}
}
