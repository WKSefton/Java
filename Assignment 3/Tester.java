public class Tester
{
  public static void main(String[] args)
  {
    //Create objects
    Circle testCircle = new Circle(3);
    Cylinder testCylinder = new Cylinder(5,5);
    
    //Circle test
    System.out.println("-----Testing Cricle Methods-----");
    System.out.print("Circle radius is 3\n");
    System.out.println(testCircle.toString() + "\n");
    testCircle.setRadius(5);
    System.out.println("Circle Radius change to: " + testCircle.getRadius());
     System.out.println("Circle Radius\t=\t" + testCircle.getRadius());
     System.out.println("Circle Circumference\t=\t" + testCircle.calcCircumference());
     System.out.println("Circle Area\t=\t" + testCircle.calcAreaCircle());
    //error test
    System.out.println("Attempting to change radius to -1.");
        try{
    testCircle.setRadius(-1);
    }catch(Exception e)
    {
      System.out.println(e.getMessage());
    }
    
    //Cylinder test
    System.out.println("-----Testing Cylinder Methods-----");
    System.out.println("Cylinder raidus is 5\nCylinder height is 5\n");
    System.out.println(testCylinder.toString() + "\n");
    testCylinder.setHeight(10);
    System.out.println("Cylinder Height changed to: " + testCylinder.getHeight());
    System.out.println("Cylinder Height\t=\t" + testCylinder.getHeight());
    System.out.println("Cylinder Area\t=\t" + testCylinder.calcAreaCylinder());
    System.out.println("Cylinder Volume\t=\t" + testCylinder.calcVolumeCylinder());
    //error test
    System.out.println("Attempting to change height to -1.");
    try{
    testCylinder.setHeight(-1);
    }catch(Exception e)
    {
      System.out.println(e.getMessage());
    }    
  }
  
}