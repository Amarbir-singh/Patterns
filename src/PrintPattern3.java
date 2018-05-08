
public class PrintPattern3 
{
	 public static void main(String[] args)
	  {
		  int n=0;
		  int k=10;
		  int count=0;
		  for(int i = 1;i<10;i++)
		  {
			  int x=0;
			  n++;
			  while(n>0)
			  {
				  
				  System.out.print(" ");
				  System.out.print("  ");
			       n--;
			       x++;
			  }
			  while(k>1)
			  {
				  System.out.print("#");
				  System.out.print("  ");
				  k--;
			  }
			  k=9;
			  k=k- count;
			  n=x;
			  count++;
			  
			  
			  System.out.println();
		  }
	  }
}
