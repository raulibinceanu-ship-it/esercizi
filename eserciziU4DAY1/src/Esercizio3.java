public class Esercizio3 {
}
import java.util.Scanner;

public class Esercizio3 {

    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    public static int pariDispari(int n) {
        return (n % 2 == 0) ? 0 : 1;
    }

    public static double perimetroTriangolo(double a, double b, double c) {
        double p = (a + b + c) / 2; // semiperimetro
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci lato 1 del rettangolo: ");
        double l1 = scanner.nextDouble();

        System.out.print("Inserisci lato 2 del rettangolo: ");
        double l2 = scanner.nextDouble();

        System.out.println("Perimetro rettangolo: " + perimetroRettangolo(l1, l2));

        System.out.print("Inserisci un numero intero: ");
        int n = scanner.nextInt();
        System.out.println("Pari (0) o Dispari (1): " + pariDispari(n));

        System.out.print("Inserisci lato A del triangolo: ");
        double a = scanner.nextDouble();

        System.out.print("Inserisci lato B del triangolo: ");
        double b = scanner.nextDouble();

        System.out.print("Inserisci lato C del triangolo: ");
        double c = scanner.nextDouble();

        System.out.println("Area del triangolo: " + perimetroTriangolo(a, b, c));

        scanner.close();
    }
}