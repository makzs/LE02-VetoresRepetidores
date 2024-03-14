// 2. Escreva um algoritmo que leia em um vetor uma sequência finita de números digitados pelo usuário e,
// logo após, mostre o número de cada posição do vetor e se ele é positivo, negativo ou zero.

import java.util.Scanner;

public class Exercicio02 {

    public static void Executar02(){

        Scanner leitor = new Scanner(System.in);
        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++){
            System.out.println("Informe o " + (i+1) + "o valor: ");
            valores[i] = leitor.nextInt();
        }

        for (int i = 0; i < valores.length; i++){
            System.out.println("Posição " + i + ":");
            if (valores[i] > 0){
                System.out.println("valor: " + valores[i] + " -> positivo");
            }
            else if (valores[i] == 0){
                System.out.println("valor: " + valores[i] + " -> zero");
            }
            else{
                System.out.println("valor: " + valores[i] + " -> negativo");
            }
        }

        leitor.close();

    }

}
