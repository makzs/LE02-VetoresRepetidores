// 7. Faça um programa que leia dois vetores de 5 elementos cada e verifique se eles são iguais ou não. 
// Para serem iguais, todos os elementos dos dois vetores devemcoincidir

import java.util.Scanner;

public class Exercicio07 {
    
    public static void Executar07(){
        Scanner leitor = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        boolean iguais = true;

        System.out.println("Informe os valores do primeiro vetor: ");
        for (int i = 0; i < 5; i++){
            System.out.println("Informe o " + (i+1) + "o valor: ");
            vetor1[i] = leitor.nextInt();
        }

        System.out.println("---------------------------------------");

        System.out.println("Informe os valores do segundo vetor: ");
        for (int i = 0; i < 5; i++){
            System.out.println("Informe o " + (i+1) + "o valor: ");
            vetor2[i] = leitor.nextInt();
        }

        for (int i = 0; i < 5; i++){
            if (vetor1[i] != vetor2[i]){
                iguais = false;
            }
        }

        if (iguais == true){
            System.out.println("Os vetores são identicos!");
        }
        else if (iguais == false ){
            System.out.println("Os vetores são diferentes!");
        }
        else{
            System.out.println("Erro.");
        }

        leitor.close();

    }

}
