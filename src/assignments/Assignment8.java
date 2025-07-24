package assignments;

public class Assignment8{

    public void driver(){

      SuperCar sc = SuperCar.getInstance(); // directly access bcz getInstance() in static.
//    we can use without any object

        Video v1 = new Video();
        v1.setVideo("Doraemon",248,12345,12);
        v1.getVideo();

    }
}

class Video{
    private  String title;
    private int views;
    private int likes;
    private int totalVideos;

    public void setVideo(String title, int views, int likes, int totalVideos){
        this.title = title;
        this.views = views;
        this.likes = likes;
        this.totalVideos = totalVideos;
    }

    public void getVideo(){
        System.out.println("Title: " + this.title);
        System.out.println("Views: " + this.views);
        System.out.println("Likes: " + this.likes);
        System.out.println("Total Videos: " + this.totalVideos);
    }
}

class SuperCar{
    private String ownerName;
    private int price;
    private String colour;
    private String brand;

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

//    Singleton
    private SuperCar(){ } // private: So that bahar object nahi ban sko.

// Que.   agar object nahi bnega to instance method ko kaise call krenge?
// Ans.   static ba ke
    private static  SuperCar ref;
    public static SuperCar getInstance(){
        if(ref == null){ // allow only one object.
           ref = new SuperCar();
           return ref;
        }
        return null;
    }
}