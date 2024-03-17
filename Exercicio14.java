// 14. Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione o maior elemento na última
// posição do vetor. Nenhum número do vetor pode serapagado ou duplicado. Apresente o vetor atualizado na tela.

import java.util.Scanner;

public class Exercicio14 {

    public static void Executar14(){
        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[5];

        System.out.println("Informe os valores do vetor A: ");
        for (int i = 0; i < 5; i++){
            System.out.println("Informe o " + (i+1) + "o valor: ");
            vetorA[i] = leitor.nextInt();
        }

        System.out.println("Vetor original: ");

        for (int i = 0; i < 5; i++){
            System.out.print(vetorA[i] + " - ");
        }

        for (int i = 0; i < vetorA.length - 1; i++)
        {
            if (vetorA[i] > vetorA[i + 1])
            {
                int aux = vetorA[i];
                vetorA[i] = vetorA[i+1];
                vetorA[i+1] =  aux;
            }
        }

        System.out.println("\nVetor alterado: ");

        for (int i = 0; i < 5; i++){
            System.out.print(vetorA[i] + " - ");
        }

        leitor.close();

    }

}
