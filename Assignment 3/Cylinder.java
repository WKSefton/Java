public class Cylinder extends Circle
{
  private double height;
  
  /**
   * Cylinder constructor
   * 
   * @param double Raidus of circle
   * @param double Height of cylinder
   */
  public Cylinder(double radius, double height)
  {
    super.setRadius(radius);
    setHeight(height);
  }
  
  /**
   * Accessor method to return height
   * 
   * @return double Height of the cylinder
   */
  public double getHeight()
  {
    return this.height;
  }
  
  /**
   * Mutator method to change the height
   * returns error code if height entered is negative.
   * 
   * @param double New height of the cylinder
   */
  public void setHeight(double newHeight)
  {
    if(newHeight < 0)
    throw new NegativeArgumentException("The height cannot be negative! Height not changed.\n");
    
    this.height = newHeight;
  }
  
  /**
   * Method to calculate and return the area
   * of the cylinder
   * 
   * @return double Area of the cylinder
   */
  public double calcAreaCylinder()
  {
    return 2*super.calcAreaCircle() + super.calcCircumference()*this.height;
  }
  
  /**
   * Method to calculate and return the volume
   * of the cylinder
   * 
   * @return double Volume of the cylinder
   */
  public double calcVolumeCylinder()
  {
    return super.calcAreaCircle()*this.height;
  }
  
  /**
   * overrides toString
   * 
   * @overide
   * @return String Returns the Instance data
   */
  public String toString()
  {
    return "Cylinder Height\t=\t" + this.height + "\nCylinder Area\t=\t" + calcAreaCylinder() + "\nCylinder Volume\t=\t" + calcVolumeCylinder();
  }  
}