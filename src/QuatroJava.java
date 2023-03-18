

import java.util.Scanner;

public class QuatroJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vet = new double[5];

        System.out.println("Escreva cinco números: ");
        for (int i = 0; i < vet.length; i++) {            
            vet[i] = sc.nextInt();
        }
        System.out.println("Vetor na posição 3: "+vet[2]);
        sc.close();
    }
    
}
