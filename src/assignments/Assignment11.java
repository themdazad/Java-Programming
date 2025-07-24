package assignments;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.lang.Math;

public class Assignment11 {
    public void driver(){
        TimeAndDate currentDate = new TimeAndDate();
        currentDate.printDate();
        currentDate.printTime();

        Random r = new Random();
        r.printRandom();

        Roots.calculateRoots(1,2,3);

    }
}

class TimeAndDate{
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void printDate(){
        System.out.println(f.format(now));
    }

    public void printTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(f.format(now));
    }
}
class Random{

    public void printRandom(){
        double myRandom1 = Math.random() * 100; // Between  0 - 100
        double myRandom2 = Math.random() * 100 + 100; // Between 100 - 200

        System.out.println("I'm random: " + (int)myRandom1);
        System.out.println("I'm random: " + (int)myRandom2);

    }
}

class Roots{
    public static void calculateRoots(int a, int b, int c){
        double x1, x2;
        x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

        System.out.println("Root 1 : " + x1 );
        System.out.println("Root 2 : " + x2 );

    }
}
