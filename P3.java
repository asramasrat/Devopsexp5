

public class P3
{
  public static void main(String args[]) 
  {
      int n = 5;
      //Outer Loop for number of Rows
      for(int i=0;i<n;i++)
      {
          // Inner loop for printing '*' in each column.
          for(int j=0;j<n;j++)
          {
              // For first row and last row we print '*' and for every other row we print the '*' at boundary region. 
              if(i==0 || i==n-1 || j==0 || j==n-1)
              {
              System.out.print("*  ");
              }
         }
       }
   }
}
        