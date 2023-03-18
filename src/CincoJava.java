

import java.util.Scanner;

public class CincoJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Object[][] matriz = new Object[3][5];
        double[] media = new double[3];
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        String nomeMenor = "";
        String nomeMaior = "";


        for (int i = 0; i < 3; i++) {
            double soma = 0.0;
            System.out.println("Escreva o nome do aluno: ");
            matriz[0][i] = sc.next();

            for (int j = 0; j < 4; j++) {
                System.out.println("Escreva a "+(j+1)+"° nota do aluno: ");
                matriz[i][j+1] = sc.nextDouble();
                soma += (Double) matriz[i][j+1];                
            }
            media[i] = soma/4;
        }

        for (int i = 0; i < 3; i++) {
            if (menor > media[i]) {
                menor =media[i];
                nomeMenor = (String) matriz[0][i];
            }
            if (maior<media[i]) {
                maior = media[i];
                nomeMaior = (String) matriz[0][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno: "+matriz[0][i]);
            System.out.println("Media: "+media[i]);           
        }
        System.out.println("Aluno com maior média: "+nomeMaior);
        System.out.println("Aluno com menor média: "+nomeMenor);
        sc.close();
    }
}
