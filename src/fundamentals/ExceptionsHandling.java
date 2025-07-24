package fundamentals;
import java.util.Scanner;

public class ExceptionsHandling {

    public void driver(){
        Test t1 = new Test();

        t1.implicitThrowImplicitCatch();
        t1.implicitThrowExplicitCatch();
        t1.explicitThrowImplicitCatch();
        t1.explicitThrowExplicitCatch();
    }
}


class Test{

    void implicitThrowImplicitCatch(){ // 1. compiler universal error throw kr dega
        System.out.println("Enter two number:");
        Scanner input = new Scanner(System.in); // creating an object for input
        int a = input.nextInt();
        int b = input.nextInt();

        int c = a/b;

        System.out.println("Result is : " + c); // Exception may raise
    }

    void implicitThrowExplicitCatch(){  // 2.
        try{
            System.out.println("Enter two number:");
            Scanner input = new Scanner(System.in); // creating an object for input
            int a = input.nextInt();
            int b = input.nextInt();
            int c = a/b;
            System.out.println("Result is : " + c); // Exception may raise
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());  // given my compiler agar uske pas universal exception known rhe tb
        }
        finally{
            System.out.println("Expectations handled :)");
        }
    }

    void explicitThrowImplicitCatch(){  // 3.

            System.out.println("Enter two number:");
            Scanner input = new Scanner(System.in); // creating an object for input
            int a = input.nextInt();
            int b = input.nextInt();
        if(b==0){
            throw new ArithmeticException("You can not divide by zero");
        }
            int c = a/b;
            System.out.println("Result is : " + c); // Exception may raise
    }

    void explicitThrowExplicitCatch(){  // 4.

        System.out.println("Enter two number:");
        Scanner input = new Scanner(System.in); // creating an object for input
        int a = input.nextInt();
        int b = input.nextInt();
        try{

        if(b==0){
            throw new ArithmeticException("You can not divide by zero");
        }
        int c = a/b;
        System.out.println("Result is : " + c); // Exception may raise
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Exception handled successfully.");
        }


    }
}