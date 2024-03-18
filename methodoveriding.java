class shape
{
    void draw(){
        System.out.println("can't say any shape");
    }
}
class square extends shape
{
    @Override
    void draw(){
        System.out.println("it is square");
    }
}
class Demo{
    public static void main(String[] args) {
        shape obj=new square();
        obj.draw();
    }
}
