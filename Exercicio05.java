// 5. Elabore um programa que leia 5 números do teclado e os armazene em um vetor.Em seguida, 
// leia um número n qualquer e apresente na tela a quantidade de vezesque o número n aparece no vetor.
import java.util.Scanner;

public class Exercicio05 {

    public static void Executar05(){
        Scanner leitor = new Scanner(System.in);
        int[] valores = new int[5];
        int cont = 0;
        
        for (int i = 0; i < valores.length; i++){
            System.out.println("Informe o " + (i+1) + "o valor: ");
            valores[i] = leitor.nextInt();
        }

        System.out.println("Informe um valor qualquer: ");
        int n = leitor.nextInt();

        System.out.println("A quantidade de vezes que esse valor qualquer aparece no vetor é de: ");

        for (int i = 0; i < valores.length; i++){
            if (valores[i] == n){
                cont++;
            }
        }

        System.out.println(cont + " vezes");

        leitor.close();
    }

}
