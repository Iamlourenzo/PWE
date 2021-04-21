import java.util.Scanner;

public class 4Exercicio {

	public static void main(String[] args) {
			int [] N = new int [10]; 
			double x=0;

			Scanner entrada = new Scanner (System.in);
			x = entrada.nextInt(); 

			for (int i = 0; i <N.length; i++)
			{
				System.out.println(String.format("N["+i+"]= %.4f",x));
				x = x/2;
			}
		}
}
