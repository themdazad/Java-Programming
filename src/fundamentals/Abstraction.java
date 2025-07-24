package fundamentals;

public class Abstraction {
    public static  void driver(){
//        E ojb = new E(); // object creation is not allowed for abstract class.       

        F obj = new F();
        obj.print();


    }
}

abstract class E{
    public final int a = 12;
    public abstract void print();  // class must be abstract for abstract method.

}

 class F extends  E{
    public void print(){
        System.out.println(super.a);
    }
}

