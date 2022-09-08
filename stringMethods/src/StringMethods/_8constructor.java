package StringMethods;

public class _8constructor {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        //constructore is a special method that create class
        Myclass anotherObj = new Myclass(10);
        System.out.println(anotherObj.varible);
    }
}
class Myclass{
    int varible;
    Myclass(){ //default constructor name same as the class
        System.out.println("");
    }
    Myclass(int var){//parameterized constructor
        varible = var;
    }
}

/*
* similarity constructor and method
* both are function
* both have the argument list
* both of them can be overloaded
*/

//why constructor cannot be static??;_no constructor can't be static
//return type:constructor doesn't have a return type, not even void
//method can have the many name but the construtor can have only name as same class name


