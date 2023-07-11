package aula_01;

import java.util.Scanner;

public class Aula_01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A, B, C, R, S;
        float D;
        System.out.println("Código desenvolvido pela Turma da UC de Programação - Noite!");
        System.out.println("Digite o valor de A:");
        A = ler.nextInt();
        while (A<0){
            System.out.println("Valor digitado não é válido. Informe um valor POSITIVO!");
            System.out.println("Digite o valor de A:");
            A = ler.nextInt();
        }
        System.out.println("Digite o valor de B:");
        B = ler.nextInt();
        if (B<0){
            B = B*(-1);
            System.out.println("O valor digitado foi negativo. Será multiplicado por -1 para ser positivo!");
        }
        System.out.println("Digite o valor de C:");
        C = ler.nextInt();
        while (C<0){
            System.out.println("Valor digitado não é válido. Informe um valor POSITIVO!");
            System.out.println("Digite o valor de C:");
            C = ler.nextInt();
        }
        System.out.println("A="+A+"; B="+B+"; C="+C);
        R = (A+B)*(A+B);
        S = (B+C)*(B+C);
        D = (R+S)/2;
        System.out.println("Resposta de D é: "+D);
    }
    
}
