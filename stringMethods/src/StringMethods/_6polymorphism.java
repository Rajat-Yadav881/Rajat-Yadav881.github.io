package StringMethods;

public class _6polymorphism {
    public static void main(String[] args) {
        Math sum = new Math();
        System.out.println(sum.square(5));
        System.out.println(sum.square((byte) 2));//prevent it from loss of presition
    }
}
class Math{
    //polymorphism
    //static binding,compile time polymorphism,method overloading

    int add(int x, int y){
        return x+y;
    }
    int add(int x, int y, int z){
        return x+y+z;
    }

    int square(int x){
        System.out.println("int");
        return x*x;
    }
    int square(byte b){
        System.out.println("byte");
        return  b*b+1;
    }
}
//Rules
//return type can be same or diff
//argument list should be different
