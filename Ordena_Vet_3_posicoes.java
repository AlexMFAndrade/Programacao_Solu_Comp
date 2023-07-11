package javaapplication4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        ArrayList<Float> Vetor = new ArrayList<>();
        
        int i;
        float a, b, c;
        float maior, menor, interm;
        System.out.print("Informe um valor para i: ");
        i = ler.nextInt();
        while(i < 0){
            System.out.print("Valor inválido! Informe um valor para i: ");
            i = ler.nextInt();
        }
        System.out.print("Informe um valor para a: ");
        a = ler.nextFloat();
        System.out.print("Informe um valor para b: ");
        b = ler.nextFloat();
        System.out.print("Informe um valor para c: ");
        c = ler.nextFloat();
        
        Vetor.add(a);
        Vetor.add(b);
        Vetor.add(c);
        System.out.println(Vetor);
        Collections.sort(Vetor);
        System.out.println(Vetor);
        /*
        if(a>b && a>c){
            maior = a;
            if (b>c){
                interm = b;
                menor = c;
            } else {
                interm = c;
                menor = b;
            }
        } else if(b>a && b>c){
            maior = b;
            if (a>c){
                interm = a;
                menor = c;
            } else {
                interm = c;
                menor = a;
            }
        } else{
            maior = c;
            if (a>b){
                interm = a;
                menor = b;
            } else {
                interm = b;
                menor = a;
            }
        }
        */
        switch(i){
            case 1: System.out.println(Vetor.get(0)+" "+Vetor.get(1)+" "+Vetor.get(2)); break;
            case 2: System.out.println(Vetor.get(2)+" "+Vetor.get(1)+" "+Vetor.get(0)); break;
            case 3: System.out.println(Vetor.get(1)+" "+Vetor.get(2)+" "+Vetor.get(0)); break;
            default: System.out.println("Opção inválida!");
        }
        
    }
    
}
