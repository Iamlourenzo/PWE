import java.util.Scanner;

public class 2Exercicio {

	public static void main(String[] args) {
		float [] A = new float [8];
		Scanner scan = new Scanner (System.in);
		
		for(int i = 0; i < A.length; i++)
		{
			A[i] = scan.nextFloat();
		}
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] <= 10)
			{
				 System.out.println("A["+i+"] = " + A[i] + "\n");
			}
		}
	}
}
