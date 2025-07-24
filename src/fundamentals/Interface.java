package fundamentals;

public class Interface {
    public static void driver(){

        Circle c1 = new Circle();
        c1.setRadius(2.0);

        System.out.println("Area of circle with radius " + c1.getRadius() + " is " + c1.getArea());


//      Functional Interface

        G obj = new G();
        obj.show();
//        agar ye sb nahi krna hae to
        MyFunctionalInterface obj1 = new G();
        obj1.show();

//        the best way

        MyFunctionalInterface obj2 = new MyFunctionalInterface() {
            public void show() {
                System.out.println("Anonymouse class");
            }
        };

        MyFunctionalInterface obj3 = ()->{ System.out.println("Lamda function."); };
        obj3.show();

    }
}

interface Area{
//    by default : ye public static abstract and final hote hae iske variable and methods
//  we can create only reference but not object.

    double PI = 3.14;
    double getArea();
}

// Interface ko 'implement' kiya jata hae & class ko 'extend'
class Circle {
    private double radius;
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public  double getArea(){
        return 3.14*radius * radius;
    }

}

// Functional Interface: Interface has only one function
@FunctionalInterface
interface MyFunctionalInterface{
    void show();

//    but object class ke method allows rhenge
    String toString();// ye Object class ke method hae.
}

class G implements MyFunctionalInterface{
    public void show(){
        System.out.println("My functional interface.");
    }
}