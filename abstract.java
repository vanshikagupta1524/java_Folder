 abstract class animal{
    animal(){
   System.out.printf("animals are here")  ;   
    }
    public abstract void sound();

}
 class dog extends animal{
    dog(){
        super();
    }
public void sound(){
    System.out.println("dog is barking");
}
}
class lion extends animal{
    lion(){
        super();
    }

    public void sound(){
        System.out.println("lion is roaring");
    }
}
class test{
    public static void main(String[] args) {
        dog obj1=new dog();
        
        lion obj2=new lion();
        obj1.sound();
        obj2.sound();
    }
}
