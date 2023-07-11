package inic_vetor;

import java.util.Scanner;

public class Inic_Vetor {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        final int tam_Vetor = 3;
        int[] Vetor_Inicial = new int[tam_Vetor];
        
        System.out.println("Informando os elementos do Vetor:");
        for(int pos=0; pos<tam_Vetor; pos++){
            System.out.println("Digite o valor do elemento da posição "+(pos+1)+"°:");
            Vetor_Inicial[pos] = ler.nextInt();
        }
        
        System.out.println("O vetor informado foi:");
        for(int pos=0; pos<tam_Vetor; pos++){
            System.out.print(Vetor_Inicial[pos]+" ");
        }
        
        System.out.println("\nPegando a média do vetor informado:");
        float soma=0;
        float media;
        for(int pos=0; pos<tam_Vetor; pos++){
            soma = soma + Vetor_Inicial[pos];
        }
        media = soma/tam_Vetor;
        System.out.println("A média do vetor é: "+media);
    }
    
}
