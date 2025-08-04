package fundamentals;

public class Threading {
    public static void driver(){

//        Runnable is better than using class
        A1 obj1 = new A1();
        B1 obj2 = new B1();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start(); // tabhi chelegi
        t2.start(); // ye dono parallel chalega. run() ko call krne ka wait nhi krega
    }
    public static void driver1(){
            C1 obj1 = new C1();
            D1 obj2 = new D1();

//          class C and D child class hae Thread class ka bcz we extended so direct object Thread ke method ko call kr skta hae
            obj1.start();
            obj2.start();
    }
    public static void driver2(){
//        A2 obj1 = new A2();
//        B2 obj2 = new B2();
//
//        Thread obj = new Thread(new A2());
//        Thread obj1 = new Thread(new B2());

        Thread t1 = new Thread(new Runnable(){ // Anonymous function
            public void run(){
                for(int i = 1; i<=10; i++){
                    if(i==5){
                        throw new ArithmeticException("Temp Exception.");
                    }
                    System.out.println("i=" + i + ": " + Thread.currentThread().getName());
                }
            }
        }, "t1 Thread");
        Thread t2 = new Thread(new B2());
        t1.start();
        t2.start();
    }

}



class A1 implements Runnable{
//    Agar interface ke method ko define nhi kiye to A1 abstract class bn jayega
    public void run(){
        f1();
    }

//    abhi bhi Runnable Interface access nhi kr skta f1() ko
//    but run() kr skta hae and usi run me  f1() ko call krenge
    public void f1(){
            for(int i = 1; i<=10; i++){
                System.out.println("i=" + i);
            }
    }
}
class B1 implements Runnable{
    public void run(){
        f2();
    }
    public void f2(){
        for(int j = 1; j<=10; j++){
            System.out.println("j=" + j);
        }
    }
}

class C1 extends  Thread{
    public void run(){
        f1();
    }
    public void f1(){
        for(int i = 1; i<=10; i++){
            System.out.println("i=" + i);
        }
    }
}
class D1 extends Thread{
    public void run(){
        f1();
    }
    public void f1(){
        for(int j = 1; j<=10; j++){
            System.out.println("j=" + j);
        }
    }


}

class A2 implements Runnable{
    //    Agar interface ke method ko define nhi kiye to A1 abstract class bn jayega
    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.println("i=" + i);
        }
    }
}
class B2 implements Runnable{
    public void run(){
        f2();
    }
    public void f2(){
        for(int j = 1; j<=10; j++){
            System.out.println("j=" + j);
        }
    }
}
