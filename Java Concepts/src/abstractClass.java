abstract class Animal{
    public abstract void eat();
}
class cow extends Animal{
    public void eat(){
        System.out.print("Hello");
    }
}
public class abstractClass {
    public static void main(String[] args) {
        cow obj = new cow(); //child ref and child obj is suitable
        obj.eat();
    }
}
