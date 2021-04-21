import javax.swing.JOptionPane;

public class QuadradoCubo {
	public static void main(String[] args) {
		int N;
		String QuadradoCubo="";
		N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		if ( N>1 && N<1000)
		{
			for(int i=0; i<=N; i++)
			{
				QuadradoCubo = (QuadradoCubo + "\n" + i +" "+ i*i + " " + i*i*i);
			}
			JOptionPane.showMessageDialog(null, QuadradoCubo);
		}
		else
		{
			
		}
	}
}
