import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el precio a calcular sin puntos: ");
        // el objeto de entrada estándar predefinido
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // entrada de una cadena
        System.out.println(calcIva(num));

    }
    static double calcIva(int precio) {
        double iva = 1.19;
        return precio*iva ;
        }
}