
public class PrintPattern7
{
  public static void main(String[] args)
  {

	  for(int i=1;i<9;i++)
	   {
		   for(int j=1;j<9;j++)
		   {
			  if(i==1)
			  {
				  System.out.print("*");
				  System.out.print(" ");
			  }
			  else  if(i+j==9)
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
