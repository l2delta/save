package jopane;

import javax.swing.JOptionPane;

public class Jopane {

	public static void main(String[] args) {
	
		String nota1 = JOptionPane.showInputDialog("Digite sua primeira nota: "); // JOptionPane.show: MOSTRA CAIXAS DE DI�LOGO E PREENCHIMENTO
		String nota2 = JOptionPane.showInputDialog("Digite sua segunda nota: ");
		String nota3 = JOptionPane.showInputDialog("Digite sua terceira nota: ");
		String nota4 = JOptionPane.showInputDialog("Digite sua quarta nota: ");
		
		double dnota1 = Double.parseDouble(nota1);	// Double.ParseDouble: Converte uma variav�l de "String" para "Double" 
		double dnota2 = Double.parseDouble(nota2);
		double dnota3 = Double.parseDouble(nota3);
		double dnota4 = Double.parseDouble(nota4);
		
		double media = (dnota1 + dnota2 + dnota3 + dnota4)/4;
		
		
		int resposta = JOptionPane.showConfirmDialog(null, "Voc� deseja ver seu resultado? "); // ConfirmDialog: 0 = Sim / 1 = N�o / 3 = OK
		
		if (resposta == 0) {
			
			if(media <= 6) {
			JOptionPane.showMessageDialog(null, "Sua m�dia foi: " + media + ", voc� est� reprovado");
		}
			else {
			JOptionPane.showMessageDialog(null, "Sua m�dia final foi: " + media + ", voc� est� aprovado");	
		}
	}
		else {
			System.out.println("Programa finalizado");
		}
		
		
		
			
	}

}
