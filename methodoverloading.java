class A{
    int c;
    int add(){
        int a=10;int b=5;
        c=a+b;
        return c;
    }
    void add(int x,int y){
        c=x+y;
        System.out.println(c);
    }
    void add(int x,double y){
        double p;
        p=x+y;
        System.out.println(p);
    }

}
class test{
    public static void main(String[] args) {
        A obj=new A();
        int k=obj.add();
        System.out.println(k);
        obj.add(10,20);
        obj.add(1,2.2);
       
       
    }
}