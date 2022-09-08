package StringMethods;

public class _1MethodDemo {
    public static void main(String[] args) {
        Simple simple = new Simple();

        //use the object name for calling the non-static method
        simple.methodName();
        System.out.println();
        int factorial = simple.factorial(5);
        System.out.println(factorial);
        System.out.println(simple.sum(2,4));
//        System.out.println(simple.methodName());

        //use the class name for calling the static method
        Simple.staticMethod();//called by the class because static is the part of the class
    }
}
class Simple{
//    <access specfier><return type><Method name>(<args list>){
//        //method body
//        return 0;
//    }
    static void staticMethod(){
        System.out.println("I am a static method.");
    }
    //here down it has written the return type is it a <void> or it will be <int>
    void methodName(){
        System.out.println("inside the body of the method");
    }

    //return type
    int factorial(int num){

        if(num==1 || num==2){
            return num;
        }else{
            return num*factorial(num-1);
        }
    }

    int sum(int x,int y){
        printSum(x+y);
        return x+y;
    }

    void printSum(int a){
        System.out.println(a);
    }
}
