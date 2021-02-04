
public class ShapeApp {

	public static void main(String[] args) {
       // create shapes
		Shape shape = null;
		
		// set choice
		// if 1 set circle > set radius
		//    2 set square > set side size
		//    3 set triangle > set height & base
		int choice = 1;
		
		int radious = 6;
		int side = 7;
		int height = 4;
		int base = 10;
		
     if(choice == 1) {
    	 shape = new Circle(radious);
     } else if(choice == 2) {
    	 shape = new Square(side);
     } else if(choice == 3) {
    	 shape = new Triangle(height,base);
     } else {
    	 System.out.println("Invalid Choice > " + choice);
    	 shape = new Shape();
     }
     
     double area = shape.calculateArea();
     System.out.println("Calculate Area -> " + area);

	}

}
