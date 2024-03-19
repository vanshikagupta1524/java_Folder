interface customerraju{
    int amt=5;  //static+public+final
    public abstract void send();
    // or
    // void send();
}
class vikram implements customerraju{
    @Override
     public void send()
      {
        System.out.println("give him "+amt+"rupees");
    }

}
class test{
    public static void main(String[] args) {
        customerraju h=new vikram();
        h.send();
    }
}
