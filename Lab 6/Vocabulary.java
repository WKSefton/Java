
/*
 * Vocabulary class
 * 
 * 
 * @CSE 271 HA
 * 
 * */

public class Vocabulary {
	// instance data
	private PartOfSpeech nouns;
	private PartOfSpeech verbs;
	private PartOfSpeech adverbs;
	private PartOfSpeech adjectives;
	private PartOfSpeech articles;
	private PartOfSpeech prepositions;

	/*
	 * /* Constuctor
	 */
	public Vocabulary() // a constructor doesn't return but is not void
	{
		this.nouns = new PartOfSpeech("nouns.txt");
		this.verbs = new PartOfSpeech("verbs.txt");
		this.adjectives = new PartOfSpeech("adjectives.txt");
		this.adverbs = new PartOfSpeech("adverbs.txt");
		this.articles = new PartOfSpeech("articles.txt");
		this.prepositions = new PartOfSpeech("prepositions.txt");
	}

	// Random generator methods pulling from random method in PartOfSpeech class
	public String getRandomNoun() {
		return this.nouns.getRandomWord();
	}

	public String getRandomVerb() {
		return this.verbs.getRandomWord();
	}

	public String getRandomAdverb() {
		return this.adverbs.getRandomWord();
	}

	public String getRandomArticle() {
		return this.articles.getRandomWord();
	}

	public String getRandomPreposition() {
		return this.prepositions.getRandomWord();
	}

	public String getRandomAdjective() {
		return this.adjectives.getRandomWord();
	}

	/*
	 * Main method testing
	 */
	public static void main(String[] args) {
		// could have just done one
		// Vocabulary vocab = new Vocabulary();
		// then used vocab.getRandom***() for each different one

		Vocabulary nameNoun = new Vocabulary();
		System.out.println("Random noun is " + nameNoun.getRandomNoun());

		Vocabulary nameVerb = new Vocabulary();
		System.out.println("Random Verb is " + nameVerb.getRandomVerb());

		Vocabulary nameAdverbs = new Vocabulary();
		System.out.println("Random Adverb is " + nameAdverbs.getRandomAdverb());

		Vocabulary nameAdjectives = new Vocabulary();
		System.out.println("Random Adjective is " + nameAdjectives.getRandomAdjective());

		Vocabulary nameArticles = new Vocabulary();
		System.out.println("Random Article is " + nameArticles.getRandomArticle());

		Vocabulary namePrepositions = new Vocabulary();
		System.out.println("Random Preposition is " + namePrepositions.getRandomPreposition());

	}

}