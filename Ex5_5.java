package exercicio5_matriz;

import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int total_cartelas = 0;
		int numeros = 0;
		int linha = 0;
		int coluna = 6;
		int []numeros_sorteados = new int [6];
		int i = 0;
		int j = 0;
		int acertos = 0;
		
		//List<Integer> numeros_sorteados = Arrays.as();
		
		for (i = 0; i < 6; i++) {
			System.out.println("Digite os números sorteados nesse sorteio: ");
			numeros_sorteados[i]= entrada.nextInt();
			if((numeros_sorteados[i] < 1) || (numeros_sorteados[i] > 60)) {
				System.out.println("Digite os números de 1 até 60");
				System.out.print("\n");
				i = i-1;
			}
			
			
		}
		System.out.println("numeros sorteados:\n"+Arrays.toString(numeros_sorteados));
		
		System.out.println("Digite a quantidade de cartelas: ");
		total_cartelas = entrada.nextInt();
		linha = total_cartelas;
		
		int[][] vet = new int [linha][coluna];
		int[][] ordenados = new int [0][0];

		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				Random gerador = new Random();
				numeros = gerador.nextInt(10)+1;
				vet[i][j] = numeros;
			}
			System.out.println("\nCARTELA: "+ (i + 1) +": ");
			for (int col = 0; col < coluna; col++) {
				System.out.print(vet[i][col] + " | ");
				
			}
			System.out.println();
			
			
			/*boolean resultado = buscar(vet[i], acertos , numeros_sorteados);
			System.out.println(resultado); */
			entrada.close();
		}
		}
		/*for (int lin = 0; lin < linha; lin++) {
			System.out.println();
			for (int col = 0; col < coluna; col++)
				System.out.print(vet[lin][col] + " | ");
		
		}*/
		
		
		static boolean buscar(int x, int contador_acertos, int [] vetor) {
			for (int i = 0; i < vetor.length; i++) {
				if(vetor[i] == x) {
					contador_acertos += 1;
					return true;
				}
			}
			return false;
		}
}
	

