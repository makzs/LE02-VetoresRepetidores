// 15. Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de acordo com a seguinte regra: 
// com exceção do 1º número, só é permitido armazenarum número se ele for maior que o anterior. 
// Ex.: se o primeiro valor lido for 5, o próximovalor lido só poderá ser maior que 5.

import java.util.Scanner;

public class Exercicio15 {

    public static void Executar15(){
        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[5];
        boolean validNumber = false;

        System.out.println("Informe os valores do vetor A: (os numeros tem que ser maiores que os anteriores)");
        for (int i = 0; i < 5; i++){
            if (i == 0){
                System.out.println("Informe o " + (i+1) + "o valor: ");
                vetorA[i] = leitor.nextInt();
            }
            else{
                validNumber = false;
                while (validNumber == false){
                    System.out.println("Informe o " + (i+1) + "o valor: ");
                    int vlrRequerido = leitor.nextInt();
                    if (vlrRequerido > vetorA[i-1]){
                        vetorA[i] = vlrRequerido;
                        validNumber = true;
                    }
                    else{
                        System.out.println("Valor Invalido! por favor coloque um valor maior que o anterior");
                    }
                }
            }
        }

        System.out.println("Os valores informados foram: ");

        for (int i = 0; i < 5; i++){
            System.out.print(vetorA[i] + " - ");
        }

        leitor.close();

    }

}
