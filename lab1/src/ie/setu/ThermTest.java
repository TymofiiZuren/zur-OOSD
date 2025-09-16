package ie.setu;

// Student Name 	: Tymofii Mazurenko
// Student Id Number: C00325393
// Date 			: Sep-16
// Purpose 			: My first class implementation

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );

		lab1q1.getResult();
	} // end main
} // end class ThermTest
