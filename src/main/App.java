package main;
public class App {
    public static int encontre(int[] arrayOrdenado, int num){
        for (int i = 0; i < arrayOrdenado.length; i++){
            if(num == arrayOrdenado[i]){
                return 1;
            }
        }
        return 0;
    }

    public static int maior(int[] arrayDesordenado){
        int maiorNumero = arrayDesordenado[0];
        for(int i = 0; i < arrayDesordenado.length; i++){
            if(arrayDesordenado[i] > maiorNumero){
                maiorNumero = arrayDesordenado[i];
            }

        }
        return maiorNumero;
    }

    public static Integer parMaisProximo(Integer[][] pares){
        return 1;
    }
}
