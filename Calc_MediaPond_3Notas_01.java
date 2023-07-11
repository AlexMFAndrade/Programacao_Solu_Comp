package aula_02;

import java.util.Scanner;

public class Aula_02 {

  
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float Nota_1, Nota_2, Nota_3, Med_F;
        System.out.println("Código desenvolvido pela Turma da UC de Programação - Noite!");
        System.out.println("Digite o valor da Nota 1:");
        Nota_1 = ler.nextFloat();
        while (Nota_1<0 || Nota_1>10){
            System.out.println("Valor digitado não é válido. Informe um nota VÁLIDA!");
            System.out.println("Digite o valor da Nota 1:");
            Nota_1 = ler.nextFloat();
        }
        System.out.println("Digite o valor da Nota 2:");
        Nota_2 = ler.nextFloat();
        while (Nota_2<0 || Nota_2>10){
            System.out.println("Valor digitado não é válido. Informe um nota VÁLIDA!");
            System.out.println("Digite o valor da Nota 2:");
            Nota_2 = ler.nextFloat();
        }
        System.out.println("Digite o valor da Nota 3:");
        Nota_3 = ler.nextFloat();
        while (Nota_3<0 || Nota_3>10){
            System.out.println("Valor digitado não é válido. Informe um nota VÁLIDA!");
            System.out.println("Digite o valor da Nota 3:");
            Nota_3 = ler.nextFloat();
        }
        Med_F = Nota_1*20/100+Nota_2*30/100+Nota_3*50/100;
        System.out.println("Média Final: "+Med_F);
        if(Med_F>=6){
            System.out.println("APROVADO!");
        } else if (Med_F>2){
            System.out.println("RECUPERAÇÃO!!");
        }else if(Med_F>1){
            System.out.println("Está em RECUPERAÇÃO!, mas terá de FAZER UM CURSO De Férias");
        } else{
            System.out.println("REPROVADO!");
        }
        
    }
}
