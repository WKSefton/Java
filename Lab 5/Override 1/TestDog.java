public class TestDog {

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal reference and object
      Animal b = new Dog();   // Animal reference but Dog object

      a.move();   // runs the method in Animal class
      b.move();   // runs the method in Dog class
      
      //a.bark();
      //b.bark();
      
      Dog test = new Dog();
      
      test.move();
      test.bark();
      
      Animal test2 = new Dog();
      
      test2.move();
     
   }
}