package br.edu.univas.trabalho;

public class Trabalho {
		

	public double getNumeroMaximoMatriz(double[][] matriz) {
		
		double valorMaximo = matriz[0][0];
		
		for(int linha = 0; linha < matriz.length; linha++) {
			
			for(int coluna = 0; coluna < matriz[linha].length; coluna++){
				
				if(matriz[linha][coluna] > valorMaximo) {
					valorMaximo = matriz[linha][coluna];
					
				}
			}
		}
		
		return valorMaximo;
	}

	public double getMediaMatriz(double[][] matriz) {
		
		double valorTotal = 0;
		int totalUnidades = 0;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
		
				valorTotal += matriz[linha][coluna];
				totalUnidades++;
			}
			
		}
		
		double valorMedia = valorTotal / totalUnidades;
		
		return valorMedia;
	}

	public double getStringInvertida(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getQuantidadeLetras(String string, char c) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean getIsPalindromo(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public String substituirSubstring(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean encontrarCaminho(int[][] labirintoComCaminho, int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getNumeroPalavrasArquivo(String string, String string2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double[][] getNumeroPalavrasArquivo(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean[] getAlunoAprovado(String string) {
		// TODO Auto-generated method stub
		return null;
	}


}
