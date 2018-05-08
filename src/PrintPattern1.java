
public class PrintPattern1 
{
  public static void main(String[] args)
  {
	  int n=0;
	  for(int i = 1;i<10;i++)
	  {
		  int x=0;
		  n++;
		  while(n>0)
		  {
			  
			  System.out.print("#");
			  System.out.print("  ");
		       n--;
		       x++;
		  }
		  n=x;
		  System.out.println();
	  }
  }
}
