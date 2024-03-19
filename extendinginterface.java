interface A{
    void add();
}
interface B extends A{
    void sub();
}
class C implements B{
    @Override
    public void add(){
        int a=10;int b=2;int c;
        c=a+b;
        System.out.println(c);
    }
    @Override
    public void sub(){
        int a=10;int b=2;int c;
        c=a-b;
        System.out.println(c);
    }
}
class test{
    public static void main(String[] args){
        B obj=new C();
        obj.add();
        obj.sub();
    }
}