package fundamentals;
import java.util.Scanner;

public class ExceptionsHandling {

    public void driver(){
        Test t1 = new Test();
//        t1.noExceptionHandling();
        t1.exceptionHandling();
    }
}


class Test{

     void noExceptionHandling(){
        System.out.println("Enter two number:");
        Scanner input = new Scanner(System.in); // creating an object for input
        int a = input.nextInt();
        int b = input.nextInt();

        int c = a/b;

        System.out.println("Result is : " + c); // Exception may raise
    }

     void exceptionHandling(){

        try{
            System.out.println("Enter two number:");
            Scanner input = new Scanner(System.in); // creating an object for input
            int a = input.nextInt();
            int b = input.nextInt();
            int c = a/b;
            System.out.println("Result is : " + c); // Exception may raise
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Expectations handled :)");
        }

    }
}