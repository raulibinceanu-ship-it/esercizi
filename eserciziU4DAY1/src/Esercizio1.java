public class Esercizio1 {
}

public static int moltiplica(int a, int b) {
    return a * b;
}

public static String concatena(String s, int n) {
    return s + n;
}

public static String[] inserisciInArray(String[] array, String s) {
    String[] nuovoArray = new String[6];

    // Copia i primi due elementi
    nuovoArray[0] = array[0];
    nuovoArray[1] = array[1];

    // Inserisce la stringa al terzo posto
    nuovoArray[2] = s;


    nuovoArray[3] = array[2];
    nuovoArray[4] = array[3];
    nuovoArray[5] = array[4];

    return nuovoArray;
}

public static void main(String[] args) {
    int risultato = moltiplica(3, 4);
    System.out.println("Moltiplicazione: " + risultato);

    String concatenata = concatena("Numero: ", 10);
    System.out.println("Concatenazione: " + concatenata);

    String[] array = {"A", "B", "C", "D", "E"};
    String[] nuovoArray = inserisciInArray(array, "X");

    System.out.println("Nuovo array:");
    for (String elemento : nuovoArray) {
        System.out.println(elemento);
    }
}
}
