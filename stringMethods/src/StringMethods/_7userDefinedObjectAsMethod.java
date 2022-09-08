package StringMethods;

public class _7userDefinedObjectAsMethod {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.age = 23;
        System.out.println(myMethod(employee));

        Employee employee1 = createObject();
        if(employee1==null){
            System.out.println("employee is null, can't print the age");
        }else{
            System.out.println(employee1.age);
        }
    }

    static int myMethod(Employee employee){

        return employee.age;
    }
    static Employee createObject(){

        return new Employee();
//        return null;
    }
}
class Employee{
    int age;

}
