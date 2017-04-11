public class MovingBall extends Ball {
	private double speed;
	public MovingBall() {
	
	}
	
	public MovingBall(double xValue, double yValue, double r, String c, double s) {
		super(xValue, yValue, r, c);
		speed = s;
	}
	
	public String toString() {
		return super.toString() + ", speed " + Double.toString(speed);
	
	}
	
}