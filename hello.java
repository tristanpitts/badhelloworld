import java.io.*;
import java.util.*;
import java.lang.Thread;

public class hello
{
  public static void main(String args[])
  {
    String match = "Hello World";
    StringBuilder curr = new StringBuilder("");
    Random r = new Random();
    char c;
    for(int i = 0; i < match.length(); )
    {
      c = (char)(32 + r.nextInt(94));
      System.out.print(curr.toString() + c + "\r");
      if(c == match.charAt(i))
      {
        curr.append(c);
        i++;
      }
      try
      {
        Thread.sleep(100);
      }
      catch (InterruptedException e)
      {
      }
    }
    System.out.println(curr);
  }
}
