interface A{
    void a1();
    void a2();
    public static void show(){
        System.out.println("static perform");
    }
}

class test{
    public static void main(String[] args) {
      A.show();
    }
}
