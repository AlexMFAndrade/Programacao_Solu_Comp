package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int W[] = new int[10];
        int a=0;
        int quantidade_pares=0;
        for(a=0; a<10; a++){
            System.out.print("Digite o elemento da posição "+(a+1)+": ");
            W[a] = ler.nextInt();
        }
        System.out.println("Vetor informado:");
        for(a=0; a<10; a++){
            System.out.print(W[a]+" ");
        }
        for(a=0; a<10; a++){
            if(W[a]%2 == 0){
                quantidade_pares++;
            }
        }
        System.out.println("");
        if(quantidade_pares == 0){
            System.out.println("Não foi digitado números pares!");
        } else {
            System.out.println("Quantidade de pares: "+ quantidade_pares);
        }
        //int maior=Integer.MIN_VALUE  , menor=Integer.MAX_VALUE;
        int maior=W[0]  , menor=W[0];
        for(a=1; a<10; a++){
            if(W[a]>maior){
                maior = W[a];
            } else if(W[a]<menor){
                menor = W[a];
            }
        }
        System.out.println("Maior de Vetor: "+maior);
        System.out.println("Menor do Vetor: "+menor);
        
        
        String teste = "18";
        //int x = Integer.parseInt("10");
        
        int x = Integer.parseInt(""+teste.charAt(0)) + Integer.parseInt(""+teste.charAt(1));
        int y = teste.charAt(0)-48 + teste.charAt(1)-48;
        System.out.println(x + " " + y);
    }
    
}
