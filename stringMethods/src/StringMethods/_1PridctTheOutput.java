package StringMethods;

public class _1PridctTheOutput {
    static int j=200;
    A a1 = new A();
    public static void main(String[] args) {
        _1PridctTheOutput obj = new _1PridctTheOutput();
        System.out.println(obj.j);//200
        System.out.println(obj.a1);//print the address of the a1
        obj.a1.funA();
    }
}
class A{
    int x = 10;
    void funA(){
        System.out.println("inside the funA in class A");
    }

}
