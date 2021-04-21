import java.util.Scanner;

public class 1Exericio {

	public static void main(String[] args) {
		int x[] = new int[10];
		Scanner scan = new Scanner(System.in);
		int y = 0;
		
		while(!(y > 0 && y <= 50))
		{
		System.out.println("Coloque um valor maior que 0 e menor que 50");
		y = scan.nextInt();
		}
		x[0] = y;
		System.out.println("x["+ 0 + "] = " + x[0]);
		for(int i = 1; i < x.length; i++)
		{
			x[i] = x[i-1] * 2;
			System.out.println("x["+ i + "] = " + x[i]);
		}
	}

}
