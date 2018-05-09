
public class PrintPattern6 
{
  public static void main(String [] args)
  {
	  for(int i=0;i<9;i++)
	   {
		   for(int j=0;j<9;j++)
		   {
			  if(i==0)
			  {
				  System.out.print("*");
				  System.out.print(" ");
			  }
			  else  if(i==j)
              {
            	  System.out.print("*");
				  System.out.print(" ");
              }
			 else if(i==8)
			  {
				  System.out.print("*");
				  System.out.print(" ");
			  } 
			  else
			  {
					 System.out.print(" ");
					  System.out.print(" ");
				 }
			  
			  
			}
		   System.out.println();
	   }
  }
}
