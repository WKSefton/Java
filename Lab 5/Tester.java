public class Tester
{
  public static void main(String[] args)
  {
    //objects created
    Rectangle testRec = new Rectangle(10,5);
    Box testBox = new Box(5,5,5);
    
    //testing Rectangle
    System.out.println("-----Testing Rectangle Methods-----");
    System.out.println("Width\t=\t" + testRec.getWidth());
    System.out.println("Height\t=\t" + testRec.getHeight());
    System.out.println("Area\t=\t" + testRec.calcArea());
    System.out.println("Perimeter\t=\t" + testRec.calcPerimeter());
    
    
    //testing Box
    System.out.println("-----Testing Box Methods-----");
    System.out.println("Length\t=\t" + testBox.getLength());
    System.out.println("Width\t=\t" + testBox.getWidth());
    System.out.println("Height\t=\t" + testBox.getHeight());
    System.out.println("Volume\t=\t" + testBox.calcVolumeBox());    
    System.out.println("Area\t=\t" + testBox.calcAreaBox());
    
    //testing rectagle setters
    System.out.println("-----Testing Rectangle Setter Methods-----");
    testRec.setHeight(30);
    testRec.setWidth(40);
    
    //testing Rectangle
    System.out.println("-----Testing New Rectangle-----");
    System.out.println("Width\t=\t" + testRec.getWidth());
    System.out.println("Height\t=\t" + testRec.getHeight());
    System.out.println("Area\t=\t" + testRec.calcArea());
    System.out.println("Perimeter\t=\t" + testRec.calcPerimeter());
    
    //testing box setters
    System.out.println("-----Testing Box Setter Methods-----");
    testBox.setLength(45);
    testBox.setWidth(90);
    testBox.setHeight(30);
    
    //testing Box
    System.out.println("-----Testing New Box-----");
    System.out.println("Length\t=\t" + testBox.getLength());
    System.out.println("Width\t=\t" + testBox.getWidth());
    System.out.println("Height\t=\t" + testBox.getHeight());
    System.out.println("Volume\t=\t" + testBox.calcVolumeBox());    
    System.out.println("Area\t=\t" + testBox.calcAreaBox());
  }  
}

/**
 * -----Testing Rectangle Methods----- 
Width = 10.0 
Height = 5.0 
Area = 50.0 
Perimeter = 30.0 
-----Testing Box Methods----- 
Length = 5.0 
Width = 5.0 
Height = 5.0 
Volume = 125.0 
Area = 150.0 
-----Testing Rectangle Setter Methods----- 
-----Testing New Rectangle----- 
Width = 40.0 
Height = 30.0 
Area = 1200.0 
Perimeter = 140.0 
-----Testing Box Setter Methods----- 
-----Testing New Box----- 
Length = 45.0 
Width = 90.0 
Height = 30.0 
Volume = 121500.0 
Area = 16200.0 

*/