
/*
 * Yellow Robot Child Class
 * Yellow robots use nouns, verbs, adjectives, and adverbs
 * 
 * The yellow robots understand nouns, verbs, adjectives, and adverbs and
 * produce one of the following types of phrases
 *  2 words of the same type joined by “and” (i.e., “cow and chicken”) or by "or"
 *  (i.e., "cow or chicken")
 * 
 * */

public class YellowRobot extends Robot {
	public YellowRobot(String name) {
		super(name);
	}

	// build a yellow robot phrase
	public String getPhrase() {
		String phrase = null;
		String type1 = null;
		String type2 = null;
		// four possible phrases
		int randomType = super.number.nextInt(4); // number is protected so
													// accessible here
		if (randomType == 0) // two nouns
		{
			type1 = vocab.getRandomNoun();
			type2 = vocab.getRandomNoun();
		} else if (randomType == 1)// two verbs
		{
			type1 = vocab.getRandomVerb();
			type2 = vocab.getRandomVerb();
		} else if (randomType == 2) {
			type1 = vocab.getRandomAdjective(); // two adjectives
			type2 = vocab.getRandomAdjective();
		} else if (randomType == 3)// two adverbs
		{
			type1 = vocab.getRandomAdverb();
			type2 = vocab.getRandomAdverb();
		}
		// now determine whether to connect with "and" or "or"
		randomType = super.number.nextInt(2);
		if (randomType == 0) // two nouns
		{
			phrase = type1 + " or " + type2;
		} else {
			phrase = type1 + " and " + type2;
		}

		return phrase;
	}

	/*
	 * Main method for testing
	 */
	public static void main(String[] args) {
		Robot yellow = new YellowRobot("Yellow");
		System.out.println("***Testing getName and getPhrase");
		System.out.println(yellow.getName());
		System.out.println(yellow.getPhrase());
		System.out.println("***Testing with 5 random yellow robots, using toString");
		for (int i = 0; i < 5; i++) {
			System.out.println(yellow.toString());

		}
	}
}
