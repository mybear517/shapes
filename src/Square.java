
public class Square extends Shape {
    private int size;
	public Square() {
		size = 0;
	}
    public Square(int side) {
    	this.size = side;
    }
    public int getSide() {
    	return size;
    }
    public void setSide(int size) {
    	this.size = size;
    }
 public double calculateArea() {
	 double area = size * size;
	 return area;
    }
}
