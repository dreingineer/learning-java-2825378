package my.implem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle(15, 8, 15, 8, 17);
		Triangle t2 = new Triangle(3, 2.598, 3, 3, 3);
		
		double t1Area = t1.findArea();
		System.out.println(t1Area);
		
		double t2Area = t2.findArea();
		System.out.println(t2Area);
		
		System.out.println(Triangle.numOfSides + " is a static variable if Triangle Class!");
	}

}
