public class Exer2Semana5{
    public void par_impar(){
        int x = 19;
        while(x != 1){
            if (x%2==0){
                x = x /2;
            }else {
                x = 3 * x + 1;
            }
            System.out.println(x + "-> ");
        }
    }
}

/*Escreva um programa que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
se x é par, x = x / 2
se x é impar, x = 3 * x + 1
imprime x
O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13 , a saída
será:
40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1*/