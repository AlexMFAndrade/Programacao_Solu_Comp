package javaapplication17;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class JavaApplication17 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o que deseja realizar na calculador:");
        int opcao = ler.nextInt();
        switch(opcao){
            case 1:
                System.out.println("SOMAR Números");
                break;
            case 2:
                System.out.println("SUBTRAIR Números");
                break;
            case 3:
                System.out.println("MULTIPLICAR Números");
                break;
            case 4:
                System.out.println("DIVIDIR Números");
                break;
            default:
                System.out.println("Opção Inálida!");
                break;
        }
        double raiz = sqrt(opcao);
        System.out.println("Valor da raiz quadrada: "+raiz);
    }
    
}
