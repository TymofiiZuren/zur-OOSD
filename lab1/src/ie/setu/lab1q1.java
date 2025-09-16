package ie.setu;

public class lab1q1 {

	public static void getResult() {
		
		Thermometer thermB = new Thermometer(10.0);
		double tempB = thermB.getCelsius();

		System.out.println("Temp. of Thermometer B is " + tempB);
	}
}
