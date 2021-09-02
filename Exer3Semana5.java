public class Exer3Semana5{
    public void imprimaForS(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5;j++){
                if(i%2==0){
                    System.out.print(i*j + " ");
                }
                else if(i%2!=0){
                    System.out.print(i*j + " ");
                }

            }   System.out.print("\n");
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