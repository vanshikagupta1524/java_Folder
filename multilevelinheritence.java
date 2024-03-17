class A{
    int a,b,c;
    void add(){
        a=10;b=20;
        c=a+b;

    }
    void sub(){
        a=10;b=20;
        c=a-b;

    }
}
class B extends A{
    void mul(){
        a=10;b=20;
        c=a*b;

    }
    void divide(){
        a=10;b=20;
        c=a/b;

    }
}
class C extends B{
    void rem(){
        a=10;b=20;
        c=a%b;

    }
}
 class multilevelinheritence {
    public static void main(String[] args) {
        C obj=new C();
        obj.add();obj.sub();obj.mul();obj.divide();obj.rem();
    }
}
