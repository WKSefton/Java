public class Box extends Rectangle
{
  private double length;
  
  /**
   * Constructor for Box
   * 
   * @param double Width of box
   * @param double Height of box
   * @param double Length of box
   */
  public Box(double w, double h, double l)
  {
    super(w,h);
    setLength(l);
  }
  
  /**
   * Calculates and returns the area of a box
   * 
   * @return double Area of box
   */
  public double calcAreaBox()
  {
    return 2*super.calcArea() + 2*super.getWidth()*this.length + 2*super.getHeight()*this.length;
  }
  
  /**
   * Calculates and returns the volume of a box
   * 
   * @return double Volume of box
   */
  public double calcVolumeBox()
  {
    return super.getHeight()*super.getWidth()*this.length;
  }
  
  /**
   * Mutator method to set length of box
   * 
   * @param double Length of box
   */
  public void setLength(double l)
  {
    if(l > 0)
    {
      this.length = l;
    }else{
        System.out.println("Length cannot be negative! New length not set.");
      }
  }
  
  /**
   * Accessor method for length
   * 
   * @return double Length of box
   */
  public double getLength()
  {
   return this.length; 
  }
  
}