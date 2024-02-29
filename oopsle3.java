class A{
    int x;
    int y;
    A(int a,int b){
x=a;
y=b;
    }
    void show(){
System.out.println(x);
System.out.println(y);
    }
}
class B{
    public static void main(String[] args) {
        A ref=new A(1,2);
        ref.show();
    }
}
