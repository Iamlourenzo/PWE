import java.util.Scanner;

public class 5Exercicio {

	public static void main(String[] args) {
		double [] x = new double [100];
		String resultado="";
		Scanner scan = new Scanner(System.in);
		x[0] = scan.nextDouble();
		
		for(int i = 1; i < x.length; i++)
		{
			x[i] = x[i-1]/2;
		}
		for(int i = 0; i < x.length; i++)
		{
			resultado = String.format("%.4f", x[i]);
			System.out.println("x["+i+"] = " + x[i]);
		}
	}
}
