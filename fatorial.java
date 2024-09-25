public class fatorial {

    public static void main (String[] args) {

    //Informando numero para fatorar
    int numero  = 7;
    int resultado = calcularFatorial(numero);

    //Exibir resultado do fatorial
    System.out.println("O fatorial de " + numero + " é " + resultado);
    }

    public static int calcularFatorial(int numero) { 

    //Metodo de fatoração
    int fatorial = 1;

    for  (int i = 1; i <= numero; i++){
    fatorial *= i;

    }
    return fatorial;
    }
}
