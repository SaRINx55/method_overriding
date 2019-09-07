package inheritance;

class A{
    public void show(){
        System.out.println("in show A");
    }
}
class b extends A{
    public void show(){
        System.out.println("in show b");
    }
}
public class Method_0verriding {
    public static void main(String[] args) {
        b obj = new b();
        obj.show();
    }
}
