import java.util.Scanner
public class Esercizio2 {
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Inserisci la prima stringa: ");
    String s1 = scanner.nextLine();

    System.out.print("Inserisci la seconda stringa: ");
    String s2 = scanner.nextLine();

    System.out.print("Inserisci la terza stringa: ");
    String s3 = scanner.nextLine();

    System.out.println("Ordine di inserimento: " + s1 + s2 + s3);
    System.out.println("Ordine inverso: " + s3 + s2 + s1);

    scanner.close();
}
}