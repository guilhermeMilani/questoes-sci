
import java.util.Scanner;

public class DoisJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;
        int menor= Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.println("Escreva o " + (i+1) + "° número:");
            num = sc.nextInt();
            if (maior < num) {
                maior = num;
            }
            if (menor > num) {
                menor = num;
            }
        }
        System.err.println("Maior: "+maior);
        System.err.println("Menor: "+menor);
        sc.close();
    }
}
