package exercicio5_matriz;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Ex5_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int turmas = 0;
		int qtdeAlunos = 0;
		int linha = 0;
		int coluna = 0;
		int totalAlunos = 0;
		
		double nota1 = 0;
		double nota2 = 0;
		double maiorNota = 0;
		double menorNota = 0;
		double mediaAluno = 0;
		double maiorMedia = 0;
		double menorMedia = 0;
		double mediaTotal = 0;
		
		String nomeAluno ="";
		String abaixoDaMedia ="";
		String acimaDaMedia ="";
		String nomeTurma ="";
		String nomeMaiorMedia ="";
		String nomeMenorMedia ="";
		List<String> todosMaiorNota = new ArrayList<>();
		List<String> todosMenorNota = new ArrayList<>();
		
		System.out.println("Digite a quantidade de Turmas: ");
		turmas = entrada.nextInt();
		linha = turmas;
		
		double[][] vet = new double [linha][coluna];

		for (int i = 0; i < linha; i++) {
			System.out.println("Digite a turma: "+ (i + 1) + ":");
			nomeTurma = entrada.next();
			System.out.println("Digite a quantidade de alunos nessa turma: ");
			qtdeAlunos = entrada.nextInt();
			coluna = qtdeAlunos;
			totalAlunos += qtdeAlunos;
			
			for (int j = 0; j < coluna; j++) {
				System.out.println("Digite o nome do aluno: "+ (j + 1) + ":");
				nomeAluno = entrada.next();
				
				for (int k = 0; k < 1; k++) {
					System.out.print("Informe a nota 1: ");
					nota1 = entrada.nextDouble();
					System.out.print("Informe a nota 2: ");
					nota2 = entrada.nextDouble();

					if ((i == 0 && j == 0 && k == 0)) {
						acimaDaMedia = nomeAluno;
						abaixoDaMedia = nomeAluno;
					}
					mediaAluno = ((nota1+nota2) / 2);
					mediaTotal += (nota1+nota2);
					if (nota1 > nota2) {
						
						maiorNota = nota1;
						menorNota = nota2;
					}
					if (nota1 < nota2) {
						abaixoDaMedia = nomeAluno;
						maiorNota = nota2;
						menorNota = nota1;
					}

					double soma = (nota1+nota2)/2;
					
					if ((i == 0 && j == 0 && k == 0)) {
						menorMedia = soma;
						nomeMenorMedia = nomeAluno;
		
						maiorMedia = soma;
						nomeMaiorMedia = nomeAluno;
					}
					if (maiorMedia < soma) {
						maiorMedia = soma;
						nomeMaiorMedia = nomeAluno;
						acimaDaMedia = nomeAluno;
						todosMaiorNota.add(nomeAluno);
					}
					if (menorMedia > soma) {
						menorMedia = soma;
						nomeMenorMedia = nomeAluno;
						abaixoDaMedia = nomeMenorMedia;
						todosMenorNota.add(nomeAluno);
					}
					
					System.out.println(" Nome do aluno: " + nomeAluno);
					System.out.println(" Nota 1: " + nota1);
					System.out.println(" Nota 2: " + nota2);
					System.out.println(" a maior nota desse aluno: " + maiorNota);
					System.out.println(" a menor nota desse aluno: " + menorNota);
					
				}
				System.out.println(" a maior Média da turma: " + 
						nomeTurma +" foi do aluno: "+
						nomeMaiorMedia+", com a média: "+maiorMedia);
				System.out.println(" a menor Média da turma: " + 
						nomeTurma +" foi do aluno: "+
						nomeMenorMedia+", com a média: "+menorMedia);
			}
		System.out.println("\n Turma: " + nomeTurma);
		System.out.println(" aluno acima da média: " + acimaDaMedia);
		System.out.println(" aluno abaixo da média: " + abaixoDaMedia);
		System.out.println(" a média é: " + mediaAluno);
		System.out.println(" a maior Média da turma: " + maiorMedia);
		System.out.println(" a menor Média da turma: " + menorMedia);
		System.out.println(" a média da turma "+nomeTurma+" é: " + (mediaTotal / (double)qtdeAlunos));
		System.out.println(" lista de alunos acima da média: " + todosMaiorNota);
		System.out.println(" lista de alunos abaixo da média: " + todosMenorNota);
		System.out.println(" total de alunos dessa instituição de ensino: "+totalAlunos);
		System.out.print("\n");
		}
		entrada.close();
		
	}
}

