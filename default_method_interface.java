interface A{
    void a1();  //public+abstract
    void a2();  //public+abstract
    default void a3(){
        System.out.println("it can be overriden or not");
    }
}
class B implements A{
    public void a1(){
        System.out.println("its a1");
    }
    public void a2(){
        System.out.println("its a2");
    }
}
class C implements A{
    public void a1(){
        System.out.println("its a1");
    }
    public void a2(){
        System.out.println("its a2");
    }
}
class D implements A{
    public void a1(){
        System.out.println("its a1");
    }
    public void a2(){
        System.out.println("its a2");
    }
}
class test{
    public static void main(String[] args) {
        B obj1=new B();
        obj1.a1();
        obj1.a2();
        obj1.a3();
        C obj2=new C();
        obj2.a1();
        obj2.a2();
        obj2.a3();
        D obj3=new D();
        obj3.a1();
        obj3.a2();
        obj3.a3();
    }
}
