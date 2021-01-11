package Practice2;

public class RectShape implements Shapes {
	protected int height;
	protected int width;
	
	public RectShape(int A, int B) {
		height = A;	
		width = B;
	}
	
	public void draw() {
		
	}
	public double getArea(){
		return (double)(height*width);
	}
	public void redraw() {
		
	}
	
}
