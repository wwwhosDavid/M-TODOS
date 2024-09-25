import java.util.Scanner;

public class retornab {

    public static void main (String[] main) {

    //Escanear os numeros a e b
    Scanner scan = new Scanner(System.in);
    System.out.println("Informe o numero A");
    int a = scan.nextInt();

    System.out.println("Informe o numero B");
    int b =  scan.nextInt();

    //Exibir os numeros a e b
    System.out.println(a + "," + b);

    }
}
