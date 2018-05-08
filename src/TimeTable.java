
public class TimeTable 
{
   public static void main(String [] args)
   {
	   int n=0;
	   for(int i=1;i<13;i++)
	   {
		  
		   for(int j=1;j<13;j++)
		   {
			  
			   if((n==0)&&(j>4))
			   {
				   
			     System.out.print(j*i+"    ");
			     if(j==5)
			    	 System.out.print("  ");
			   }
			   else
				   System.out.print(" "+j*i+"  ");
			   
			   
		   } 
		   n++;
		   System.out.println();
		   
		  
	   }
   }
}
