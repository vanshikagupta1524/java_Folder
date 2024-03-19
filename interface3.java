// multiple inheritence using interface
interface A{
    void show();
}
interface B{
    void show();
}
class c implements A,B{
    public void show(){
        System.out.println("interface A and B");
    }
    public static void main(String[] args) {
        c obj=new c();
        obj.show();
    }
}
