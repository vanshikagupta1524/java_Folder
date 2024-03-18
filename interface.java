import java.util.Scanner;
interface client{
void input(); //public+abstract
void output(); //public+abstract
}
class Raju implements client
{
    String name;
    int age;
    public void input(){
        Scanner r=new Scanner(System.in);
        System.out.println("enter your username");
       name=r.nextLine();
       System.out.println("enter you age");
       age=r.nextInt();
    }
    public void output(){
        System.out.println(name+" "+age);
    }
}
class test{
    public static void main(String[] args) {
        client c=new Raju();
        c.input();c.output();
    }
}