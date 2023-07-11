package teste;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        float a, b, c;

        System.out.printf("Bem vindo ao calculadora escolar de tres notas! \nInforme a primeira nota: ");
        a = ler.nextFloat(); 
        while (a<0 || a>10){
            System.out.printf("Informe uma nota válida\n");
            System.out.printf("Digite a primeira nota: ");
            a = ler.nextFloat();
        }
        System.out.printf("Informe o segundo valor.: ");
        b = ler.nextFloat(); 
        while (b<0 || b>10){
            System.out.printf("Informe uma nota válida\n");
            System.out.printf("Digite a segunda nota: ");
            b = ler.nextFloat();
        }
        System.out.printf("Informe o terceiro valor.: ");
        c = ler.nextFloat(); 
        while (c<0 || c>10){
            System.out.printf("Informe uma nota válida\n");
            System.out.printf("Digite a terceira nota: ");
            c = ler.nextFloat();
        }
        System.out.printf("\nResultado:\n");
        System.out.printf("%.1f + %.1f + %.1f = %.1f\n", a, b,c,(a + b+ c)/3); 
    }  
}