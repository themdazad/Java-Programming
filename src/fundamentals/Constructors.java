package fundamentals;

public class Constructors {
	// driver 
	public void driver(){

		Box b1 = new Box(7,5);
		Box b2 = new Box();
		System.out.println("I'm inside main driver.");
		b1.printBox();
		b2.printBox();

	}
}


//Initializer

class Box {
	private int height;
	private int breadth;


//	default constructor
	public Box(){}

//	Initializer: Initialize for each constructor when object created
	{
		height = 12;
		breadth = 13;
	}

//	Static Initializer: Initialize every time when class load
	private static int boxCount;


//	parameterized constructor
	public Box(int h, int b){
		this.height = h;
		this.breadth = b;
	}

	public void printBox(){
		System.out.println("Box Height:" + height);
		System.out.println("Box Breadth:" + breadth);
	}

	static {
		boxCount = 2222;
		System.out.println("I'm inside static Initializer.");
	}

}