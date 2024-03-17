class A{
    int a;double b;String c;
    A(){
a=100;b=2.1;c="ankur";
System.out.println(a+" " + b +" "+c);
    }
    A(int x){
a=x;
    }
    A(double y,String s){
b=y;
c=s;
    }
}
class B{
    public static void main(String[] args) {
        A r1=new A();
        A r2=new A(10);
        A r3=new A(1.1,"mahi");
        System.out.println(r1.a+" "+r1.b+" "+r1.c);
        System.out.println(r2.a);
        System.out.println(r3.b+" "+r3.c);
        


    }
}