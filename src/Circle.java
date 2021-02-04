
public class Circle extends Shape {
	private int size =0;
	public Circle() {
		size = 0;
	}
	public Circle(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double calculateArea() {
		double r= size;
		double area=(22*r*r)/7 ;

		return area;
	}
}
