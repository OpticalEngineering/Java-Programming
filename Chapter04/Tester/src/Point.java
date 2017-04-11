public class Point {
	
	private double xCoordiante;
	private double yCoordiante;
	public Point() {
		
	}
	
	public Point(double x, double y) {
		xCoordiante = x;
		yCoordiante = y;
		
	}
	
	public String toString() {
		return "(" + Double.toString(xCoordiante) + "," + Double.toString(yCoordiante) + ")";
		
	}
	
}