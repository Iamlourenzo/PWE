import java.util.Scanner;

public class 3Exercicio {

	public static void main(String[] args) {
		int[] x = new int [20];
		int troca, posicao=1;
		Scanner scan = new Scanner(System.in);
		
		for( int i = 0; i < x.length; i++)
		{
			x[i] = scan.nextInt();
		}
		for(int i = 0; i< x.length/2; i++)
		{
			troca = x[i];
			x[i] = x[x.length - posicao];
			x[x.length - posicao] = troca;
			posicao++;
		}
		for(int z=0; z < x.length; z++)
		{
			System.out.println("x["+z+"] = " + x[z]);
		}
	}

}
