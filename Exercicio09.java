// 9. Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C
//de acordo com as seguintes regras: 
// a. Os elementos das posições pares de C são os elementos das posições pares de A;
// b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B

import java.util.Scanner;

public class Exercicio09 {

    public static void Executar09(){
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

        int contA = 0;
        int contB = 0;

        for (int i = 0; i < 10; i++){
            if (i % 2 == 0){
                vetorC[i] = vetorA[contA];
                contA++;
            }
            else {
                vetorC[i] = vetorB[contB];
                contB++;
            }
        }

        System.out.println("-------------------------------");
        System.out.println("Valores do vetor C: ");

        for (int i = 0; i < 10; i++){
            System.out.print(vetorC[i] +" - ");
        }

        leitor.close();

    }

}

