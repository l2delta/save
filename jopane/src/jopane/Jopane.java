package jopane;

import javax.swing.JOptionPane;

public class Jopane {

	public static void main(String[] args) {
	
		String nota1 = JOptionPane.showInputDialog("Digite sua primeira nota: "); // JOptionPane.show: MOSTRA CAIXAS DE DIÁLOGO E PREENCHIMENTO
		String nota2 = JOptionPane.showInputDialog("Digite sua segunda nota: ");
		String nota3 = JOptionPane.showInputDialog("Digite sua terceira nota: ");
		String nota4 = JOptionPane.showInputDialog("Digite sua quarta nota: ");
		
		double dnota1 = Double.parseDouble(nota1);	// Double.ParseDouble: Converte uma variavél de "String" para "Double" 
		double dnota2 = Double.parseDouble(nota2);
		double dnota3 = Double.parseDouble(nota3);
		double dnota4 = Double.parseDouble(nota4);
		
		double media = (dnota1 + dnota2 + dnota3 + dnota4)/4;
		
		
		int resposta = JOptionPane.showConfirmDialog(null, "Você deseja ver seu resultado? "); // ConfirmDialog: 0 = Sim / 1 = Não / 3 = OK
		
		if (resposta == 0) {
			
			if(media <= 6) {
			JOptionPane.showMessageDialog(null, "Sua média foi: " + media + ", você está reprovado");
		}
			else {
			JOptionPane.showMessageDialog(null, "Sua média final foi: " + media + ", você está aprovado");	
		}
	}
		else {
			System.out.println("Programa finalizado");
		}
		
		
		
			
	}

}
