// copy constructor 
// copy the content of default constructor in antoher constructor
// class A{
//     int a;
//     String b;
//     A(){
//         a=10;
//         b="learn java";
//         System.out.println(a+" "+b);
//     }
//     A(A ref){
//         a=ref.a;
//         b=ref.b;
//         System.out.println(a+" "+b);
//     }
// }
// class B{
//     public static void main(String[] args) {
//         A r=new A();
//         A p=new A(r);
//     }
// }

// copy the content of parametrized constructor into another constructor
class A{
    int a;
    int b;
    
    A(int x, int y){
        a = x;
        b = y;
        System.out.println(a + " " + b);
    }
    
    A(A sef){
        a = sef.a;
        b = sef.b;
        System.out.println(a + " " + b);
    }
}

class B{
    public static void main(String[] args) {
        A a = new A(1, 2);
        A p = new A(a);
    }
}