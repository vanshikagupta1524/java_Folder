class A{
 
    A(){
        System.out.println("learn coding");
    }
    {
        System.out.println("like coding");
    }
    static void show(){
        System.out.println("enjoy coding");
    }
    

}
class B{
    public static void main(String[] args) {
        A.show();
        A m=new A();
        // A.show();

    }
}