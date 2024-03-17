class A{
     protected int age;int roll_no;
    String name;
   protected void input(){
        System.out.println("enter your marks and rollno");

    }

}
class B extends A{
   

    void display(){
        age=5;roll_no=10;
        name="vanshika";
        System.out.println(age+" "+name+" "+roll_no+" ");

    }
    public static void main(String[] args) {
        B obj=new B();
        obj.input();
        obj.display();
    }
}
