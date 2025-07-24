package fundamentals;

public class SuperExample {
    public void driver(){

        A obj1 = new B();
        obj1.f1();

//        B obj2 = obj1; // Child obj refrence can't hold refrence of object of parent class;
//         object B ka hi ban rha hae but obj1 ka type A hae isliye compiler ko lg rha hae obj1 class A ko refence kr rha he.

        B obj2 = (B)obj1; // cast krna prega, compiler ko lg rha tha ki A class ke object ka reference hae, here we told ki ye B class ke object ka reference hae.
        obj2.f2();

        D obj3 = new D(); // constructor will call automatically
    }
}

 class A{
    int a = 12;
    public void f1(){
        System.out.println("A");
    }
   public A(){
        System.out.println("Parent Constructor.");
    }
}

class B extends A{
    int a = 15;
    public void f2(){
        System.out.println("B");
        System.out.println(super.a); // access superClass member if name conflict
        System.out.println(this.a); // access currentClass member if name conflict

        /* Note: Static method me 'this' and 'super' kuchh nhi hota*/
    }
}

//Constructor Inheritance | Constructor Chaining
class C{
    public C(){
        System.out.println("superClass C non-parameterized constructor");
    }
}
class D extends C{
   public D(){
       this(5);
       System.out.println("subClass non-parameterized constructor.");
   }
   public D(int x){
       super();
       System.out.println("subClass parameterized constructor");
   }
};