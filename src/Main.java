package src;

public class Main {

    public static void main(String[] args) {
    	Triangle t1 = new Triangle(15, 8, 15, 8, 17);
		Triangle t2 = new Triangle(3, 2.598, 3, 3, 3);
		
		double t1Area = t1.findArea();
		System.out.println(t1Area);
		
		double t2Area = t2.findArea();
		System.out.println(t2Area);
		
		System.out.println(Triangle.numOfSides + " is a static variable if Triangle Class!");
		
		System.out.println("Creating a student!");
		System.out.println("###################");
		Student andrei = new Student("Andrei", "Aquino", 2008, 2.75, "communications");
		System.out.println(andrei);
		andrei.partyPary();
		andrei.partyPary();andrei.partyPary();
		System.out.println(andrei);
		
		Student bloom = new Student("bloom", "maninang-aquino", 2009, 1.5, "nursing");
		System.out.println(bloom);
		bloom.partyPary();
		bloom.partyPary();
		System.out.println(bloom);
    }

}
