
/*
 * Robot Abstract Parent Class
 * 
 * All robots have names and generate a phrase
 * For review of an abstract class, see BJLO page 434, Special topic 9.3
 * Why do we want the parent class of all the Robots to be an abstract class?

 * */

import java.util.Random;

public abstract class Robot {
	// instance variables
	protected static Vocabulary vocab = new Vocabulary();; // so children can
															// use vocabulary
															// without accessing
															// it themselves
	protected String name;
	protected static Random number = new Random();// so children can use a
													// random number without
													// declaring it themselves

	/**
	 * Constructor
	 * 
	 * @param name
	 *            - robot name
	 */
	public Robot(String name) {
		this.name = name;
	}

	/**
	 * Accessor
	 * 
	 * @return the robot name
	 */
	public String getName() {
		return this.name;
	}

	// overrides toString()
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return getName() + " says " + getPhrase();
	}

	/**
	 * abstract method for child programs to complete
	 * 
	 * @return the phrase the robot builds.
	 */
	public abstract String getPhrase();

}
