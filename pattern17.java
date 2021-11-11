import java.util.*;
class pattern17
{
     public static void main(String arg[])
    {
       try{
            int n,i,j;
            Scanner t=new Scanner(System.in);
            System.out.println("Enter n");
            n=t.nextInt();
            for(i=1;i<=n;i++)
             {
                   for(j=1;j<=i;j++)
                    {
	        if(j%2==0)
	          {
                                System.out.print("0");
	           }
	            else{
	                 System.out.print("1");
	              }
                    }
                     System.out.println();
               }
           }
           catch(Exception e)
	{
	  System.out.println(e);
                 }
       }
}

