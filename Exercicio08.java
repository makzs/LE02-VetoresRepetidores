// 8. Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a concatenação de A e B, 
// ou seja, C contém os elementos de A seguidos dos elementos de B.

import java.util.Scanner;

public class Exercicio08 {

    public static void Executar08(){
        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];

        System.out.println("Informe os valores do primeiro vetor: ");

        for (int i = 0; i < 5; i++){
            System.out.println("Informe o " + (i+1) + "o valor: ");
            vetorA[i] = leitor.nextInt();
        }

        System.out.println("Informe os valores do segundo vetor: ");

        for (int i = 0; i < 5; i++){
            System.out.println("Informe o " + (i+1) + "o valor: ");
            vetorB[i] = leitor.nextInt();
        }

        for (int i = 0; i < 5; i++){
            vetorC[i] = vetorA[i];
        }

        int aux = 5;

        for (int i = 0; i < 5; i++){
            vetorC[aux] = vetorB[i];
            aux++;
        }

        System.out.println("-------------------------------");
        System.out.println("Valores concatenados: ");

        for (int i = 0; i < 10; i++){
            System.out.print(vetorC[i] +" - ");
        }

        leitor.close();

    }

}
