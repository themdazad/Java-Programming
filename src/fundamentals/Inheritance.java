package fundamentals;

public class Inheritance {
    public void driver(){
//

//
//        e1.setName("Azad");
//        e1.setAge(23);
//        e1.setSalary(80000);
//
//        System.out.println("Name:" + e1.getName());
//        System.out.println("Age:" + e1.getAge());
//        System.out.println("Salary:" + e1.getSalary());

//        Method Overriding
          Base b1 = new Base(); Employee e1 = new Employee();
          b1.show();

    }
}



class Base{
public int x = 12;
    {
        x = 15; // can be changed later
    }

//    ********* Final (Like const in c/c++) ****************
//
//    private final int value; //  you can not leave blank, It is 'blank final variable' currently.
//
//    1. Direct Declaration
//private final int y = 0; // value assign so later changes not possible
//    {
//        y = 12;
//    }
//
//    2. Initialization block
//private final int z; // value not assigned
//    {
//        z = 4; // can be assign only once, later not possible
//        z = 5; // invalid
//    }
//
// private final int a;
//    public Base(){
//        a = 6;
//    }
//
//   Static final
//    public static final int val = 10;
//    public static final String name;
//    static {
//        name = "Azad";
//    }





    public void show(){
        System.out.println("I'm base class function.");
    }
}

class Derived extends Base{
    public  void show(){
        System.out.println("I'm derived class function");
    }
}

final class Base1{
    public void show(){
        System.out.println("I'm final base1 class and I can not extend by any derived class. ");
    }
}

//class Derived1 extends Base1{
//    Base1 restricted Inheritance, can not be extended by any class
//}



//Super class
class Person{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//sub class
class Employee extends  Person{
    private  double salary;

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
}

