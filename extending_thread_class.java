// class A extends Thread{
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("hii");
            
//         }
//     }
// }
// class B{
//     public static void main(String[] args) {
//         A t=new A();
//         t.start();
//         for(int i=0;i<5;i++){
//             System.out.println("heya");
//         }
//     }
// }

class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hii");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){

            }
            
        }
    }
}
class B{
    public static void main(String[] args) {
        A t=new A();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("heya");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                
            }
            
        }
    }
}
