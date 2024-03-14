// 3. Faça um programa que leia em um vetor uma sequência finita de números digitadospelo usuário. 
// Crie um segundo vetor que armazene o dobro de cada número do primeiro vetor e depois 
// apresente os valores deste vetor.

import java.util.Scanner;

public class Exercicio03 {

    public static void Executar03(){

        Scanner leitor = new Scanner(System.in);
        int[] valores = new int[5];
        int[] valoresDobrados = new int[5];

        for (int i = 0; i < valores.length; i++){
            System.out.println("Informe o " + (i+1) + "o valor: ");
            valores[i] = leitor.nextInt();
            valoresDobrados[i] = valores[i] * 2;
        }

        System.out.println("Valores informados: ");

        for (int i = 0; i < valores.length; i++){
            System.out.print(valores[i] + " - ");
        }

        System.out.println("\nValores informados Dobrados: ");

        
        for (int i = 0; i < valores.length; i++){
            System.out.print(valoresDobrados[i] + " - ");
        }

        leitor.close();
        
    }

}
