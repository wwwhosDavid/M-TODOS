import java.util.Scanner;

public class minutos {

    public static void main(String [] args) {

    //Escanear os minutos
    Scanner scan = new Scanner(System.in);
    System.out.println("Quantos minutos deseja transformar em horas?");
    int minutos = scan.nextInt();

    //Puxa metodo de conversao
    String resultado = converterMinutosHoras(minutos);

    //Exibe resultado do calculo
    System.out.println(resultado);

    }

    public static String converterMinutosHoras(int minutos) {

    //Método de conversao
    int horas = minutos / 60;
    int minutosSobra = minutos % 60;

    return horas + " hora e " + minutosSobra + " minutos";
    } 
}
