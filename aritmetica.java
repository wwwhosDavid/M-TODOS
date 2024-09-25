
import java.util.Scanner;

public class aritmetica {
    public static void main(String[] args) {
    
        //Escanear os três números que se pede
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        int n1 = scan.nextInt();

        System.out.println("Informe o segundo número");
        int n2 = scan.nextInt();

        System.out.println("Informe o terceiro número");
        int n3 = scan.nextInt();
    
        //Método calcularMedia dos três números
        double media = calcularMedia(n1, n2, n3);

        //Mostrar o resultado
        System.out.println("A média dos três números é: " + media);
    }
    
    //Método que calcula a média aritmética de três números
    public static double calcularMedia(int numero1, int numero2, int numero3) {
        
        // Calcula a soma e divide por 3, voltando para double para não ter erro no resultado
        
        return (numero1 + numero2 + numero3) / 3.0; 
    }
}
