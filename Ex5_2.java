package exercicio5_matriz;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Ex5_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int LIN = 4;
		final int COL = 4;
		double preco = 0;
		double soma = 0;
		double media = 0;
		double somaTotal = 0;
		double maisCaro = 0;
		double maisBarato = 0;
		
		String nomeCaro ="";
		String nomeBarato ="";
		String nome ="";
		
		double[][] vet = new double [LIN][COL];

		for (int i = 0; i < LIN; i++) {
			System.out.println("Digite o nome do mercado " + (i + 1)+ ": ");
			nome = entrada.next();
			for (int j = 0; j < COL; j++) {
				System.out.print("Informe o valor do produto "+ (j + 1) + ":");
				vet[i][j] = entrada.nextDouble();
				soma = soma + vet[i][j];	
				somaTotal += vet[i][j];
				if ((i == 0 && j == 0)) {
					nomeCaro = nome;
					nomeBarato = nome;
					//maisCaro += vet[i][j];
					maisBarato += vet[i][j];
				}
			}
			
			if (somaTotal > maisCaro ) {
				nomeCaro = nome;
				maisCaro = somaTotal;
			}
			if (somaTotal < maisBarato) {
				nomeBarato = nome;
				maisBarato = somaTotal;
			}
			System.out.println("\n Mercado: " + nome);
			System.out.println(" preço: " + preco);
			System.out.println(" a soma de preços por supermercado: " + somaTotal);
			somaTotal = 0;
			System.out.print("\n");
			
		}
		for (int lin = 0; lin < LIN; lin++) {
			System.out.println();
			for (int col = 0; col < COL; col++)
				System.out.print(vet[lin][col] + " | ");
		}

		media = soma / (float)(LIN * COL);
		System.out.println(" \n a soma é: " + soma);
		System.out.println(" a média é: " + media);
		System.out.println("nome do mercado mais barato: " + nomeBarato +", soma dos preços: "+ maisBarato);
		System.out.println("nome do mercado mais caro: " + nomeCaro+", soma dos preços: "+ maisCaro);
		
		entrada.close();
		
	}
}
