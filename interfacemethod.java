interface client{
    public abstract void design();
    void devlop();
}
abstract class rajtech implements client{
@Override
public void design(){
    System.out.println("give me design");
}
}
class rahultech extends rajtech{
    @Override
    public void devlop(){
        System.out.println("devlop website for me");
    }
}

class test{
    public static void main(String[] args) {
       client obj= new rahultech();
        obj.design();
        obj.devlop();
    }
}
