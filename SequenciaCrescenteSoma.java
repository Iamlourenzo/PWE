import javax.swing.JOptionPane;

public class SequenciaCrescenteSoma {

	public static void main(String[] args) {
		int M, N, O, Soma=0;
		String Sequencia="";
		M = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		N = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		if(M<=0 || N<=0)
		{
			System.out.println("");
		}
		else
		{
			if(M<N)
			{
				O=M; M=N; N=O;
			}
			for(int I=N; I<=M; I++)
			{
				Sequencia = (Sequencia +" "+I);
				Soma = Soma + I;
			}
			JOptionPane.showMessageDialog(null, Sequencia + " Sum=" + Soma);
		}
	}

}
