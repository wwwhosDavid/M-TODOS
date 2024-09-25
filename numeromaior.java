import java.util.Scanner;

public class numeromaior {
    public static void main(String[] args) {

    //Escanear os tres numeros
    Scanner scan = new Scanner(System.in);
    System.out.println("Informe um número");
    int num1 = scan.nextInt();

    System.out.println("Informe outro número");
    int num2 = scan.nextInt();

    System.out.println("Informe mais um número");
    int num3 = scan.nextInt();

    //Chamando o metodo escanear
    int numeroMaior = escanearMaior (num1, num2, num3);

    //Exibir o resultado de qual numero é maior
    System.out.println("O maior numero é: " +numeroMaior);
    }

    public static int escanearMaior(int numero1, int numero2, int numero3) {

    //Metodo para ver qual numero é maior
    if (numero1 >= numero2 && numero1 >= numero3) {
        return numero1;
    } else if (numero2 >= numero1 && numero2 >= numero3) {
        return numero2;
    } else {
        return numero3;
    }
    }
}
