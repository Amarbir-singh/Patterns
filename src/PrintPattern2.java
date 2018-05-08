
public class PrintPattern2 
{
   public static void main(String [] args)
   {
	   int n=9;
	   int x=9;
		  for(int i = 1;i<10;i++)
		  {
			  while(n>0)
			  {
				  System.out.print("#");
				  System.out.print("  ");
			       n--;
			   }
			   x--;
			   n=x;
			   System.out.println();
		  }
	  }
   }

