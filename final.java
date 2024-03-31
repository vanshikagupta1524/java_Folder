// class A{

// }
// class test{
//     public static void main(String[] args) {
//         final int a=10;
//         System.out.println(a);
//         a=20;
//         // we cannot reasign the value in case of final
//         System.out.println(a);

//     }
// }
class test{
    void mnumber(){
        System.out.println("444444444");
    }
   final void atmpin(){
        System.out.println("11");
    }
}
class thief extends test{
    // @override
    void mnumber(){
        System.out.println("488888");
    }
    // @Override
 

}
class Final{
    public static void main(String[] args) {
        thief obj1=new thief();
        obj1.mnumber();
        obj1.atmpin();
    }
}
