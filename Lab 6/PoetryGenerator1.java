import java.util.Scanner;

/**
 * @author wernerla
 *         This Poetry Generator asks the user for four combination of
 *         Robots to generate a poem from Blue,Red,Green, Purple, and Yellow
 *         Robots. Blue,Red,Green, Purple, and Yellow Robot classes are needed
 *         to generate the poems. This is a tester for Lab 6 and will not
 *         compile until all the Robots are completed.
 */
public class PoetryGenerator1 {

 /**
  * @param args
  */
 // private instance data
 private BlueRobot blue;
 private RedRobot red;
 private YellowRobot yellow;
 private GreenRobot green;
 private PurpleRobot purple;

 /*
  * Constructor
  */
 public PoetryGenerator1() {
  // instance variables
  this.blue = new BlueRobot("Blue");
  this.red = new RedRobot("Red");
  this.yellow = new YellowRobot("Yellow");
  this.green = new GreenRobot("Green");
  this.purple = new PurpleRobot("Purple");
 }

 /*
  * Poem Creation from input
  * 
  * @formal parameter choices made for an array of use choices
  * 
  * @Blue = 0, Red = 1, Green = 2, Purple = 3, Yellow = 4
  */
 public String getUserSelectedFour(int choice[], int numChoices) {
  String poem = null;
  for (int i = 0; i < numChoices; i++) {
   if (choice[i] < 0 || choice[i] >= numChoices)
    poem = "A non valid choice was selected, cannot create poem!";
   else {
    // array ex. choice 1 set to array point 0
    Robot[] robot = { blue, red, green, purple, yellow };
    poem = "";
    for (int j = 0; j < numChoices; j++)
     poem += robot[choice[j]].getPhrase() + "\n";
   }

  }
  return poem;
 }

 public static void main(String[] args) {

  PoetryGenerator1 poem = new PoetryGenerator1();
  Scanner in = new Scanner(System.in);
  final int NUM_CHOICES = 6;
  System.out.println("Welcome to Robot Poetry");
  System.out.println("Make " + NUM_CHOICES + " selections to build a poem.");
  int[] choice = new int[NUM_CHOICES];// for user robot choices
  for (int i = 0; i < NUM_CHOICES; i++) {
   do {
    menu(); // display robot choices
    choice[i] = in.nextInt() - 1;// counting starts at zero
    if ((choice[i] < 0 || choice[i] > NUM_CHOICES)) {// message for
     // out of range
     System.out.println("Not a vaid robot choice");
    }
   } while (choice[i] < 0 || choice[i] > NUM_CHOICES);
  }

  String poemtoDisplay = poem.getUserSelectedFour(choice, choice.length);
  System.out.println("*******Robot generated poem*********");
  System.out.println(poemtoDisplay);
 }

 /**
  * menu for selecting four robots
  */
 public static void menu() {
  System.out.println("Please Select one of these Robots:");
  System.out.println("1. Blue");
  System.out.println("2. Red");
  System.out.println("3. Green");
  System.out.println("4. Purple");
  System.out.println("5. Yellow");
  System.out.print("Enter Robot (1-5)");
 }

}
/**
 * *******Robot generated poem********* 
head and starling
behind the pistol
thine buttercup listening
careful excited jam
finishing meticulously and desperately
blue-eyed  feather
*/