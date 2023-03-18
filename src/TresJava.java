

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TresJava {
    private String nome;
    private List<Double> notas;

    public TresJava(String nome, Double... notas) {
        this.nome = nome;
        this.notas = Arrays.asList(notas);

    }

    public TresJava() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double media() {
        double sum = 0;
        for (Double nota : notas) {
            sum += nota;
        }
        return (sum) / 4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int desejaEncerrar;
        
        List<TresJava> list = new ArrayList<>();
        
        do {
            Double[] nota = new Double[4];
            System.out.println("Escreva o nome do aluno: ");
            String nome = sc.next();
            for (int i = 0; i < 4; i++) {
                System.out.println("Escreva a " + (i + 1) + "° nota:");
                nota[i] = sc.nextDouble();
            }

            TresJava aluno = new TresJava(nome, nota);
            list.add(aluno);

            System.out.println("Digite 1 para continuar cadastrando ou 2 para obter as medias: ");
            desejaEncerrar = sc.nextInt();
        } while (desejaEncerrar == 1);

        for (TresJava aluno : list) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Media: " + aluno.media());
            if (aluno.media() < 6) {
                System.out.println("Reprovado");
            } else {
                System.out.println("Aprovado");
            }
            System.out.println();
        }
        sc.close();
    }

}
