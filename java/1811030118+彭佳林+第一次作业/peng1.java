import java.util.Scanner;
public class peng1  
{
	public static void main(String[] args) 
	{
		int i,j,k;
		System.out.print("������������");
		Scanner scanner = new Scanner(System.in);
		k = scanner.nextInt(); 
		for(i=0;i<k;i++)
		{	
			for(j=0;j<i+1;j++)
			{	
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}	
}
