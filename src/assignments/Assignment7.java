package assignments;

//public class : accessible anywhere
public class Assignment7 {
    public void driver(){
        Complex c1 = new Complex();
        c1.setComplex(10,20);
        c1.printComplex();

        System.out.println("\n***************************************\n");

        Time t = new Time();
        t.setTime(3,45,20);
        t.printTime();

        System.out.println("\n***************************************\n");

        Cuboid cb = new Cuboid();
        cb.setBreadth(2);
        cb.setHeight(4);
        cb.setLength(1);
        System.out.println("Length: " + cb.getLength());
        System.out.println("Breadth: " + cb.getBreadth());
        System.out.println("Height: " + cb.getHeight());
        System.out.println("Volume: " + cb.getVolume());

        System.out.println("\n***************************************\n");

        Distance d1 = new Distance();
        Distance d2 = new Distance();
        Distance d3; // no object need, bcz we will assign obj reference later;
        d1.setDistance(12,100,16);
        d2.setDistance(8,50,4);

        d3 = d1.addDistance(d2);
        System.out.println("Addition of distance is : ");
        d3.printDistance();
    }
}

//default class : accessible within the package (only inside assignments)
class Complex{

    //instance member
    private int real, img;

    //instance member function
    public void setComplex(int r, int i){
        real = r;
        img = i;

    }

    public void printComplex(){
        System.out.println("Real="+real + "\nImaginary="+img);
    }

}

class Time{
    private int hours, minutes, seconds;

    public void setTime(int hr,int min, int sec){
        hours = hr;
        minutes = min;
        seconds = sec;
    }

    public void printTime(){
        System.out.println(hours+"hr:"+minutes+"min:"+seconds + "sec");
    }

}

class Cuboid{
    private int length, breadth, height;

//    Setters : setVariableName; ye simple method hote hae jiska name variable name ke
//    prefix me 'set' lga dene se bn jata hae ex- setLength.
    public void setLength(int l){length = l;}
    public void setBreadth(int b) { breadth = b; }
    public void setHeight(int h){height = h; }

//  Getters: value return kr ke dega bs
    public int getLength(){ return length; }
    public int getBreadth(){ return breadth; }
    public int getHeight(){ return height; }

    public int getVolume(){return length*breadth*height; }

}

class Distance{
    private int km,m,cm;

    public void setDistance(int k, int mtr,int c){
        km = k;
        m = mtr;
        cm = c;
    }

    public void printDistance(){
        System.out.println("Distance "+km+ ":Kilometer, " + m + ":Meter, " + cm + ":Centimeter. \n" );
    }

    public Distance addDistance(Distance d){
        Distance temp = new Distance();

        temp.cm = d.cm + cm;
        temp.m = temp.m/100 + m + d.m;
        temp.km = temp.km/1000 + km + d.km;

        return temp;

    }
}