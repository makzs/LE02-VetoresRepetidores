// 10. Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copieos elementos de A em B 
// de forma invertida. Ou seja, o primeiro elemento de A é oúltimo elemento de B,
// o segundo elemento de A é o penúltimo elemento de B, e assimpor diante.

import java.util.Scanner;

public class Exercicio10 {

    public static void Executar10(){
        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Informe os valores do vetor A: ");
        for (int i = 0; i < 5; i++){
            System.out.println("Informe o " + (i+1) + "o valor: ");
            vetorA[i] = leitor.nextInt();
        }

        int aux = 0;

        for (int i = 4; i >= 0; i--){
            vetorB[aux] = vetorA[i];
            aux++;
        }

        System.out.println("Valores do vetor B: ");
        for (int i = 0; i < 5; i++){
            System.out.print(vetorB[i] + " - ");
        }

        leitor.close();
    }

}
