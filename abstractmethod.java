// abstract class programming{
//     public abstract void developer();
//     public abstract void rank();
// }
// abstract class html extends programming{
//     @Override
//     public void developer(){
//         System.out.println("tim");
//     }
// }
//  class java extends html{
//     @Override
//     public void rank(){
//         System.out.println("games gosling");
//     }
// }
// class test{
//     public static void main(String[] args) {
//         programming obj=new java();
//         obj.developer();
//         obj.rank();

//     }
// }

// ********************another method
// here java extends programming and fro  super class(programming )we need to
// made abstract in front of sub class so that every abstract method of super classs must be in use

// abstract class programming{
//     public abstract void developer();
//     public abstract void rank();
// }
//  class html extends programming{
//     @Override
//     public void developer(){
//         System.out.println("tim");
//     }
//     @Override
//     public void rank(){
//         System.out.println("games gosling");
//     }
// }
//   abstract class java extends programming{
//     @Override
//     public void developer(){
//         System.out.println("tim");
//     }
    
// }
// class test{
//     public static void main(String[] args) {
//         programming obj=new html();
//         obj.developer();
//         obj.rank();

//     }
// }