
public class PrintPattern5 
{
   public static void main(String[] args)
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
			  if(i==8)
			  {
				  System.out.print("*");
				  System.out.print(" ");
			  } 
			  if(j==0)
			  {
				  System.out.print("*");
				  System.out.print(" ");
			  }
			  
			}
		   System.out.println();
	   }
   }
}
