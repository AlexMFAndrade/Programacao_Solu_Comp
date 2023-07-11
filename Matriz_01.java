package inic_matriz;

import java.util.Scanner;

public class Inic_Matriz {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        final int Qtd_Linhas = 3;
        final int Qtd_Colunas = 3;
        int[][] Matriz_Inicial = new int[Qtd_Linhas][Qtd_Colunas];
        
        System.out.println("Recebendo os elementos da Matriz:");
        for(int li=0; li<Qtd_Linhas; li++){
            for(int co=0; co<Qtd_Colunas; co++){
                System.out.println("Digite o elemento da linha "+(li+1)+", coluna "+(co+1)+":");
                Matriz_Inicial[li][co] = ler.nextInt();
            }
        }
        
        System.out.println("Informando a Matriz digitada:");
        for(int li=0; li<Qtd_Linhas; li++){
            for(int co=0; co<Qtd_Colunas; co++){
                System.out.print(Matriz_Inicial[li][co]+" ");
            }
            System.out.println("");
        }
        
        int[] Vet_Principal = new int[Qtd_Linhas];
        int[] Vet_Secundaria = new int[Qtd_Linhas];
        int soma_AcDP=0, soma_AbDP=0;
        for(int li=0; li<Qtd_Linhas; li++){
            for(int co=0; co<Qtd_Colunas; co++){
                if(li == co){
                    Vet_Principal[li] = Matriz_Inicial[li][co];
                } else if(li<co){
                    soma_AcDP = soma_AcDP+Matriz_Inicial[li][co];
                } else{
                    soma_AbDP = soma_AbDP+Matriz_Inicial[li][co];
                }
                if(co == (Qtd_Colunas-1-li)){
                    Vet_Secundaria[li] = Matriz_Inicial[li][co];
                }
            }
        }
        System.out.println("Diag Principal:");
        for(int li=0; li<Qtd_Linhas; li++){
            System.out.print(Vet_Principal[li]+" ");
        }
        System.out.println("\nDiag Secundária:");
        for(int li=0; li<Qtd_Linhas; li++){
            System.out.print(Vet_Secundaria[li]+" ");
        }
        System.out.println("\nSoma Elementos acima da DP: "+soma_AcDP);
        System.out.println("Soma Elementos abaixo da DP: "+soma_AbDP);
    }
    
}
