import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class LuckySuitor
{
  private ArrayList<String> list = new ArrayList<String>();
  
  public void readFile(String fileName) throws FileNotFoundException
  {
    File file = new File(fileName);
    Scanner in = new Scanner(file);
    while(in.hasNextLine())
    {
     list.add(in.nextLine()); 
    }
    in.close();
  }
  
  public void getNames()
  {
    for(String name : list)
    {
     System.out.println(name); 
    }
  }
  
 public static void main(String[] args)
 {
   LuckySuitor test = new LuckySuitor();
   try{
   test.readFile("MaleNames.txt");
   }
   catch(Exception e)
   {
    System.out.println(e.getMessage()); 
   }
   test.getNames();
 }
  
}