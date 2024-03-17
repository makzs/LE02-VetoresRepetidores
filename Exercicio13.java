// 13. Elabore um algoritmo que receba um número n e retorne um vetor com os n primeiros termos da sequência de Fibonacci.
//  Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8,13, 21}.

import java.util.Scanner;

public class Exercicio13 {

    public static void Executar13(){
        Scanner leitor = new Scanner(System.in);
        int x = 0;
        int y = 1;
        int aux = 0;

        System.out.println("Informe um valor limite: ");
        int limite = leitor.nextInt();

        for (int i = 0; i < limite+1; i++){
            aux = x+y;
            System.out.print(x + ", ");
            y = x;
            x = aux;
        }

        leitor.close();
    }

}
