
public class Rectangle implements Shape2D {
	int width,height;
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return(width*height);
	}

}
