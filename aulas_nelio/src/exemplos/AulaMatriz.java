package exemplos;

import java.util.Scanner;

public class AulaMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();   // Define o n�mero de linhas/colunas da matriz (bidimensional)
		int[][] mat = new int [n][n]; 
		
		for(int i=0; i<mat.length ; i++) {       // Leitor de n�meros para cada posi��o da matriz
			for(int j = 0; j<mat[i].length ; j++) {
				mat[i][j] = sc.nextInt();
			}	
		}
		System.out.println("Main diagonal:"); // Exibe n�meros da matriz em diagonal
		for(int i = 0; i<mat.length ; i++) {   //  A linha e coluna s�o iguais ex: [0][0], [1][1],[2][2]....
				System.out.print(mat[i][i] + " ");			
			}
			System.out.println();
		int count = 0;
		for(int i = 0; i<mat.length ; i++) { //Conta a quantidade de n�meros negativos na matriz
			for(int j = 0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count ++;
				}
			}	
		}
		System.out.println("Negative numbers = " + count); //Exibe numeros negativos da matriz
		
		
		sc.close();
		
	}

}
