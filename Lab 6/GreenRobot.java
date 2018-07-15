
/*
 * @author wernerla
 * @ William K. Sefton
 * @ CSE271
 * @Date 2/27/18
 * 
 * Green Robot Child Class
 * 
 * The Green robots understand articles, adjectives, nouns, 
 * and verbs and produce one of the following types of phrases
 * article + noun + verb
 * article + adjective + noun + verb
 * 
 * */

public class GreenRobot extends Robot {
 public GreenRobot(String name) {
  super(name);
 }

 // build a Green robot phrase
 public String getPhrase() {
  String phrase = null;
  // 2 possible phrases
  int randomType = super.number.nextInt(2); // number is protected so
             // accessible here
  if (randomType == 0) // article + noun + verb
  {
   phrase = vocab.getRandomArticle() + " " + vocab.getRandomNoun() +
     " " + vocab.getRandomVerb();
  } else if (randomType == 1)// article + adjective + noun + verb
  {
   phrase = vocab.getRandomArticle() + " " + vocab.getRandomAdjective() +
     " " + vocab.getRandomNoun() + " " + vocab.getRandomVerb();
  }
  return phrase;
 }

 /*
  * Main method for testing
  */
 public static void main(String[] args) {
  Robot green = new GreenRobot("Green");
  System.out.println("***Testing getName and getPhrase");
  System.out.println(green.getName());
  System.out.println(green.getPhrase());
  System.out.println("***Testing with 5 random green robots, using toString");
  for (int i = 0; i < 5; i++) {
   System.out.println(green.toString());

  }
 }
}

/**
 * ***Testing getName and getPhrase 
Green 
a sharp sailor unveiling 
***Testing with 5 random green robots, using toString 
Green says thine leg cloistering 
Green says the mother raze 
Green says the shaggy cap sit 
Green says a wrong turtle weeps 
Green says thy happy kitten dives 
*/