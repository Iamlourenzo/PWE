import javax.swing.JOptionPane;

public class NumeroPrimo {
	public static void main(String[] args) {
	int N, X, Z;
	N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de testes que serao feitos"));
	if(N>=1 && N<=1000) 
	{
		for(int i=0; i<N; i++)
		{
			Z=0;
			X = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
			for(int O=2; O<X; O++)
			{
				if(X%O==0)
				{
					Z = Z + 1;
				}
			}
			if(Z==0) 
			{
				JOptionPane.showMessageDialog(null, X + " Eh primo");
			}
			else
			{
				JOptionPane.showMessageDialog(null, X + " Nao eh primo");
			}
		}
	}
	else 
	{
		
	}
	}
}
