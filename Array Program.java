package Java;
import java.util.*;
public class Java {
private static int sum=0;
private static String s="  ";
 	public static void main(String[] args)
	{
 		
		int[][]a;
		int i,j;
		a=new int[3][3];
		Scanner in=new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		
	
		for(i=0;i<3;i++)
		{
			System.out.printf("\n");
			for(j=0;j<3;j++)
			{
				if((i==1 && j==0)||(i==1 && j==2))
				{
					System.out.printf("%s\t",s);
					
				}
				else {
				System.out.printf("%d\t", a[i][j]);
				sum=sum+a[i][j];
				}     
			}
		}
		
		System.out.printf("\nSUM =%d",sum);
		
		
	}

}

//This Program outlook is like this
/* 1    1     1
        1      
   1    1     1  
   
  SUM = 7 
  */
