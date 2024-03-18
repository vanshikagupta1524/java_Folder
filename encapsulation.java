class A{
    private int value;
    public void setvalue(int x){
        value=x;
    }
    public int getvalue(){
        return value;
    }

}
class demo{
    public static void main(String[] args) {
        A obj=new A();
        // obj.value=>  we can't do this directly bcoz it is private  access modifier so we need to do get set methods
        obj.setvalue(1000);
        System.out.println( obj.getvalue());
    }
}
