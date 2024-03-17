// 12. Elabore um programa que leia um vetor de 12 elementos apresente na tela o produto dos elementos
// pares positivos (desconsiderar o zero). 
// Exemplo: {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840

import java.util.Scanner;

public class Exercicio12 {

    public static void Executar12(){
        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[12];
        int cont = 0;
        int quantPares = 0;
        int resultado = 1;

        for (int i = 0; i < 12; i++) {
            System.out.println("Informe o " + (i+1) + "o valor: ");
            vetorA[i] = leitor.nextInt();
            if ((vetorA[i] % 2 == 0 )&&(vetorA[i] > 0)){
                quantPares++;
            }
        }

        for (int i = 0; i < 12; i++) {
            if ((vetorA[i] % 2 == 0) && (vetorA[i] > 0)){
                cont++;
                resultado *= vetorA[i];
                if (cont == quantPares){
                    System.out.print(vetorA[i] + " = ");
                }
                else{
                    System.out.print(vetorA[i] + " * ");
                }
            }
        }

        System.out.print(resultado);

        leitor.close();
    }

}
