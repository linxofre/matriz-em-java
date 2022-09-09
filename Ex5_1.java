package exercicio5_matriz;

import java.util.Scanner;

public class Ex5_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho da matriz: ");
		
		int LIN = 0;
		do {
			System.out.println("\ndigite um número de 3 até 11: ");
			LIN = entrada.nextInt();
		} while ((LIN < 3 ) || (LIN > 11));
		
		int COL = LIN;
		int vpar = 0;
		int vimpar = 0;
		int soma = 0;
		float media = 0;
		int maior = 0;
		int menor = 0;
		int diag_principal = 0;
		int diag_secundaria = 0;
		
		int[][] vet = new int [LIN][COL];
		
		for (int lin = 0; lin < LIN; lin++) {
			for (int col = 0; col < COL; col++) {
				System.out.print("Informe o valor: "+ (col + 1) + ":");
				vet[lin][col] = entrada.nextInt();
				soma = soma + vet[lin][col];
				int num = vet[lin][col];
			
				if ((lin == 0 && col == 0)) {
					maior = vet[lin][col];
					menor = vet[lin][col];
				}
				else {
					if (maior < vet[lin][col]) 
						maior = vet[lin][col];	
					if (menor > vet[lin][col] ) 
						menor = vet[lin][col];	
				}
				if (num % 2 == 0) {
					vpar++;
					
				}
				if(num % 2 != 0) {
					vimpar++;
				}
				if(lin == col) {
					diag_principal += vet[lin][col];
				}
				if((lin>col )&&(col<lin)) {
					//diag_secundaria += vet[lin][col];
					System.out.println("DS: "+lin + ":" + col);
				}	
			}
			System.out.print("\n");
			media = soma / (float)(LIN * COL);
		}
		
		for (int lin = 0; lin < LIN; lin++) {
			System.out.println();
			for (int col = 0; col < COL; col++)
				System.out.print(vet[lin][col] + " | ");
		}
		media = soma / (float)(LIN * COL);
		System.out.println("\n a soma é: " + soma);
		System.out.println(" a média é: " + media);
		System.out.println(" o maior é: " + maior);
		System.out.println(" a menor é: " + menor);
		System.out.println(" quantidade de pares: " + vpar);
		System.out.println(" quantidade de impares: " + vimpar);
		System.out.println(" soma da diagonal principal: " + diag_principal);
		System.out.println(" soma da diagonal secundária: " + diag_secundaria);
		entrada.close();
		
	}
}
