// 6. labore um programa que leia um vetor com 5 notas de um aluno e um outro vetorcom 5 pesos e 
// calcule a média ponderada do aluno. 
// Ex.: notas: 7.5, 9.2 pesos: 6, 4. Média ponderada: (7.5 * 6 + 9.2 * 4) / (6 + 4)
import java.util.Scanner;

public class Exercicio06 {

    // -------------- Funções --------------

    public static String MediaPonderada(double[] notas, int[] pesos){

        double media = (notas[0] * pesos[0] + notas[1] * pesos[1] + notas[2] * pesos[2]) / (pesos[0] + pesos[1] + pesos[2]);
        String FormMedia = String.format("%.2f", media);
        return FormMedia;
    }

    public static void Linha(){
        System.out.println("--------------------------------------------------------------");
    }

    // -------------- Fim Funções --------------

    public static void Executar06(){
        Scanner leitor = new Scanner(System.in);

        double[] notas = new double[5];
        int[] pesos = new int[5];

        Linha();

        System.out.println("Informe o valor do peso da primeira nota: ");
        pesos[0] = leitor.nextInt();

        System.out.println("Informe o valor do peso da segunda nota: ");
        pesos[1] = leitor.nextInt();

        System.out.println("Informe o valor do peso da terceira nota: ");
        pesos[2] = leitor.nextInt();

        System.out.println("Informe o valor do peso da quarta nota: ");
        pesos[3] = leitor.nextInt();

        System.out.println("Informe o valor do peso da quinta nota: ");
        pesos[4] = leitor.nextInt();

        Linha();

        System.out.println("(peso " + pesos[0] + ") Informe o valor da primeira nota: ");
        notas[0] = leitor.nextDouble();

        System.out.println("(peso " + pesos[1] + ") Informe o valor da segunda nota: ");
        notas[1] = leitor.nextDouble();

        System.out.println("(peso " + pesos[2] + ") Informe o valor da terceira nota: ");
        notas[2] = leitor.nextDouble();

        System.out.println("(peso " + pesos[3] + ") Informe o valor da quarta nota: ");
        notas[3] = leitor.nextDouble();

        System.out.println("(peso " + pesos[4] + ") Informe o valor da quinta nota: ");
        notas[4] = leitor.nextDouble();

        Linha();

        System.out.println("O valor da media ponderada do aluno é de: ");
        System.out.println(MediaPonderada(notas, pesos));

        Linha();

        leitor.close();
    }

}