package my.implem;

public class Triangle {
	
	static int numOfSides = 3;
	//instance variables
	double base;
	double height;
	double sideLenOne;
	double sideLenTwo;
	double sideLenThree;
	public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
		super();
		this.base = base;
		this.height = height;
		this.sideLenOne = sideLenOne;
		this.sideLenTwo = sideLenTwo;
		this.sideLenThree = sideLenThree;
	}
	
	//instance method
	public double findArea() {
		return (this.base * this.height) / 2;
	}
}
