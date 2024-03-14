// 1. Construa um programa que leia em um vetor uma sequência de 5 números digitados pelo usuário, calcule a 
// média destes valores em um outro vetor, e depois apresentena tela quais valores que são menores, 
// iguais ou superiores à média.

import java.util.Scanner;

public class Exercicio01 {

    public static void Executar01(){
        Scanner leitor = new Scanner(System.in);
        int[] valores = new int[5];
        int media = 0;

        for (int i = 0; i < valores.length; i++)
        {
            System.out.println("Informe o " + (i+1) + "o valor: ");
            valores[i] = leitor.nextInt();
        }

        for (int i = 0; i < valores.length; i++){
            media += valores[i];
        }

        System.out.println("-------------------------------------");

        System.out.println("Media igual a: " + media/valores.length);

        System.out.println("-------------------------------------");

        System.out.println("Os valores que são maiores que a media são: ");
        for (int i = 0; i < valores.length; i++){
            if (valores[i] > media/valores.length){
                System.out.println( (i+1) + "o valor: " + valores[i]);
            }
        }

        System.out.println("-------------------------------------");

        System.out.println("Os valores que são iguais a media são: ");
        for (int i = 0; i < valores.length; i++){
            if (valores[i] == media/valores.length){
                System.out.println( (i+1) + "o valor: " + valores[i]);
            }
        }

        System.out.println("-------------------------------------");

        System.out.println("Os valores que são menores que a media são: ");
        for (int i = 0; i < valores.length; i++){
            if (valores[i] < media/valores.length){
                System.out.println( (i+1) + "o valor: " + valores[i]);
            }
        }

        System.out.println("-------------------------------------");


        leitor.close();
    }

}
