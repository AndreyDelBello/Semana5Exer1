public class Exer3Semana5{
    public void imprimaForS(){
        for(int n=1; n<=4; n++){
            for(int i=1; i<=n; i++){
            System.out.print(n*i+" ");
            }
            System.out.println("");
        }
    }
}


/*Imprima a seguinte tabela, usando for s encadeados:
1
2 4
3 6 9
4 8 12 16

Regra

n n*2 n*3 .... n*n*/