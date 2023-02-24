public class Recursivas {

    public static void main(String[] args){
       System.out.println(sumaRecursiva(5));

    }
    public static int sumaRecursiva(int numero ){
        if(numero == 1) {
            return 1; 
        }
        return numero + sumaRecursiva(numero - 1);

    }
//Recursion por cabeza

public static void headRecursion(int valor) {
    if (valor == 0) {
        return;
    }
    headRecursion(valor - 1);
    System.out.println(valor);
}


    public static int suma(int max) {
        int resultado = 0;

        for (int i = 0; i <= max; i++) {
            resultado = resultado + i;
        }
        return resultado;
    }
}