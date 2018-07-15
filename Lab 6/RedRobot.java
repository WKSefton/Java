
/*
 * @author wernerla
 * @Date 2/20/18
 * Red Robot Child Class
 *
 * Red robots use adjectives and nouns and returns a phrase 
 * containing an adjective concatenated with a noun (with proper spacing
 *  between the words)
 * */

public class RedRobot extends Robot {
	// constructor
	public RedRobot(String name) {
		super(name);
	}

	// build red phrase
	public String getPhrase() {
		String phrase = null;
		int n = super.number.nextInt(2);
		if (n == 0)
			phrase = vocab.getRandomAdjective() + " " + vocab.getRandomNoun();
		else
			phrase = vocab.getRandomAdjective() + " " + vocab.getRandomAdjective() + " " + vocab.getRandomNoun();
		return phrase;
	}

	/*
	 * Main method for testing
	 */
	public static void main(String[] args) {
		Robot red = new RedRobot("Red");
		System.out.println("***Testing getName and getPhrase");
		System.out.println(red.getName());
		System.out.println(red.getPhrase());
		System.out.println("***Testing with 5 random red robots, using toString");
		for (int i = 0; i < 5; i++) {
			System.out.println(red.toString());
		}

	}
}