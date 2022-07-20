import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el precio a calcular sin puntos: ");
        // Crea Scanner
        Scanner sc = new Scanner(System.in);
        //transforma Scanner en Int
        int num = sc.nextInt();
        // entrada de información a la función
        System.out.println(calcIva(num));

    }
    static double calcIva(int precio) {
        double iva = 1.19;
        return precio*iva ;
        }
}