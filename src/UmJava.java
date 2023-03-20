import java.util.Scanner;

public class UmJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        double somaNum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Escreva o " + (i+1) + "° número:");
            num[i] = sc.nextInt();
            somaNum += num[i];           
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {            
            if (num[i] % 2 != 0) {
                System.out.println("Impar: " + num[i]);
            } else {
                System.out.println("Par: " + num[i]);
            }
        }        
        System.out.println("Média: " + somaNum / num.length);
        sc.close();
    }

}
