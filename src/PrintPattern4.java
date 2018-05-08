
public class PrintPattern4 
{
	  public static void main(String [] args)
	   {
		   int n=9;
		   int x=9;
		   int k=1;
		   int m=1;
			  for(int i = 1;i<10;i++)
			  {
				  while(n>0)
				  {
					  System.out.print(" ");
					  System.out.print("  ");
				       n--;
				   }
				   x--;
				   n=x;
				   while(k>0)
					  {
						  System.out.print("*");
						  System.out.print("  ");
						  k--;
					  }
					  m++;
					  k = k+m;
				   System.out.println();
			  }
			  
			
		  }
}
