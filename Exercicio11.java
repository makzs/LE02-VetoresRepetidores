// 11. Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteirosde tamanho igual a 5. 
// Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 +8*9 = 140

import java.util.Scanner;

public class Exercicio11 {
    public static void Executar11(){
        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int resultado = 0;

        System.out.println("Informe os valores do vetor A: ");
        for (int i = 0; i < 5; i++){
            System.out.println("Informe o " + (i+1) + "o valor: ");
            vetorA[i] = leitor.nextInt();
        }

        System.out.println("Informe os valores do vetor B: ");
        for (int i = 0; i < 5; i++){
            System.out.println("Informe o " + (i+1) + "o valor: ");
            vetorB[i] = leitor.nextInt();
        }

        for ( int i = 0; i < 5; i++){
            System.out.print(vetorA[i]);
            System.out.print("*");
            System.out.print(vetorB[i]);
            if (i != 4){
                System.out.print(" + ");
            }
            else{
                System.out.print(" = ");
            }
            resultado += vetorA[i] * vetorB[i];
        }

        System.out.print(resultado);

        leitor.close();
    }
}
