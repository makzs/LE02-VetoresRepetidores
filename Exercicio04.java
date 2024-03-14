// 4. Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma variável de um número n
// qualquer, depois mostre na tela o índice dos elementos que são inferiores a n.

import java.util.Scanner;

public class Exercicio04 {

    public static void Executar04(){
        Scanner leitor = new Scanner(System.in);
        int[] valores = new int[5];
        
        for (int i = 0; i < valores.length; i++){
            System.out.println("Informe o " + (i+1) + "o valor: ");
            valores[i] = leitor.nextInt();
        }

        System.out.println("Informe um valor qualquer: ");
        int n = leitor.nextInt();

        System.out.println("Os valores informados que são inferiores a esse valor qualquer são: ");

        for (int i = 0; i < valores.length; i++){
            if (valores[i] < n){
                System.out.print(valores[i] + " - ");
            }
        }

        leitor.close();
    }

}
