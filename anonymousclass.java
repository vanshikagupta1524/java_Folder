class A{
    void show(){
        System.out.println("show in A");
    }
}
class test{
    public static void main(String[] args) {
        A obj1=new A(){
            void show(){
                System.out.println("show in test");
            }
        };
        obj1.show();
    }
}
