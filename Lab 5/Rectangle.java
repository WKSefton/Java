public class Rectangle
{
  private double width;
  private double height;
  
  /**
   * Constructor for rectangle
   * 
   * @param double Width for rectangle
   * @param double Heigth for rectangle
   */
  public Rectangle(double w, double h)
  {
    setWidth(w);
    setHeight(h);
  }
  
  /**
   * Calculates and returns perimeter
   * 
   * @return double Perimeter of rectangle
   */
  public double calcPerimeter()
  {
    return 2*this.width + 2*this.height;
  }
  
  /**
   * Calculates and returns area
   * 
   * @return double Area of rectangle
   */
  public double calcArea()
  {
    return this.width*this.height;
  }
  
  /**
   * Mutator for width
   * 
   * @param double Width of rectangle
   */
  public void setWidth(double w)
  {
    if(w > 0)
    {
      this.width = w;
    }else{
        System.out.println("Width cannot be negative! New width not set.");
      }
  }
  
  /**
   * Accessor for width
   * 
   * @return double Width of rectangle
   */
  public double getWidth()
  {
    return this.width;
  }
  
  /**
   * Mutator for height
   * 
   * @param double Height of rectangle
   */
  public void setHeight(double h)
  {
    if(h > 0)
    {
      this.height = h;
    }else{
        System.out.println("Height cannot be negative! New height not set.");
      }
  }
  /**
   * Accessor for height
   * 
   * @return double Height of rectangle
   */
  public double getHeight()
  {
    return this.height;
  }
}