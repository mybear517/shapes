
public class Triangle extends Shape {
     private int base = 0;
     private int height = 0;
	
    public Triangle() {
         base = 0;
         height = 0;
	}
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
    public int getBase() {
    	return base;
    }
    public int getHeight() {
    	return height;
    }
    public void setBase(int base) {
    	this.base=base;
    	
    }
    public void setHeight(int height) {
    	this.height = height;
    }
    public double calculateArea() {
	    double area = (height* base);
	    return area;
    }
}
