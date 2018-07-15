
/*
 * Robot Testing
 * 
 *
 * Testing of robot parent and robot child classes
 * */

public class RobotTesting {
	public static void main(String[] args) {

		Robot ron = new RedRobot("Red Ron");
		System.out.println(ron.getName());
		System.out.println(ron.getPhrase());

		YellowRobot yellow = new YellowRobot("Yellow Canary");
		System.out.println(yellow.getName() + " says: " + yellow.getPhrase());

		// now you can make an array of Robots and store different
		// child robots in each member of the array
		// but you can't do this
		// Robot aRobot = new Robot();
		// why not? Because it is an abstract class
		// why do we want an abstract class here?
		// we want all child robots to implement the abstract method getPhrase
		// we want all child robots to have a name (the only constructor
		// requires a
		// string)
		// we want to provide a toString for all children (but it can be
		// overwritten)
		Robot[] series = new Robot[4];
		series[0] = new RedRobot("Red 0");
		series[1] = new RedRobot("Red 1");
		series[2] = new YellowRobot("Yellow 2");
		series[3] = new YellowRobot("Yellow 3");
		System.out.println(series[0].toString());
		System.out.println(series[1].toString());
		System.out.println(series[2].toString());
		System.out.println(series[3].toString());
	}

}