package exercicio5_matriz;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex5_4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int qtde_Atletas = 0;
		int linha = 0;
		int coluna = 5;
		
		double salto_metros = 0;
		double mediaSaltos = 0;
		double mediaPrimeiro = Integer.MIN_VALUE;
		double mediaUltimo = Integer.MAX_VALUE;
		
		String nomeAtleta ="";
		String nomePrimeiro ="";
		String nomeUltimo ="";
		
		List<String> todosAtletas = new ArrayList<>();
		List<Double> todasMedias = new ArrayList<>();
		
		System.out.println("Digite a quantidade de Atletas: ");
		qtde_Atletas = entrada.nextInt();
		linha = qtde_Atletas;
		
		double[][] vet = new double [linha][coluna];

		for (int i = 0; i < linha; i++) {
			System.out.println("Digite nome do(a) atleta: "+ (i + 1) + ":");
			nomeAtleta = entrada.next();
			todosAtletas.add(nomeAtleta);
			
			for (int j = 0; j < coluna; j++) {
				System.out.print("Informe a distância do salto "+ (j + 1) + ": ");
				salto_metros = entrada.nextDouble();
				vet[i][j] = salto_metros;

				if (i == 0 && j == 0) {
					nomePrimeiro = nomeAtleta;
					nomeUltimo = nomeAtleta;
				}
				
				mediaSaltos += salto_metros;		
			}
			
			mediaSaltos = mediaSaltos / 5;
			todasMedias.add(mediaSaltos);
			
			if (mediaSaltos > mediaPrimeiro) {
				mediaPrimeiro = mediaSaltos;
				nomePrimeiro = nomeAtleta;
			}
			if (mediaSaltos < mediaUltimo) {
				mediaUltimo = mediaSaltos;
				nomeUltimo = nomeAtleta;
			}
			
			for (int lin = 0; lin < linha; lin++) {
				System.out.println();
				for (int col = 0; col < coluna; col++)
					System.out.print(vet[lin][col] + " | ");
			}
			System.out.println("\nA Média de saltos do(a) atleta " + 
					nomeAtleta +" foi de: "+
					mediaSaltos+" metros");
			System.out.println("A Média do(a) primeiro(a) colocado "+nomePrimeiro+"  é: "+mediaPrimeiro);
			System.out.println("A Média do(a) último(a) colocado "+nomeUltimo+"  é: "+mediaUltimo);
			System.out.println("todas médias: "+todasMedias);
			System.out.print( "\n");
			mediaSaltos = 0;
	}
	System.out.println("atletas dessa competição"+todosAtletas);
	entrada.close();
		
	}
}

