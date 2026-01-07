package es3;


import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        String parola = "";
        Scanner scanner = new Scanner(System.in);
        String newParola = "";
        do {
            System.out.println("Inserisci una stringa:");
            parola = scanner.nextLine();
             int lunghezza = parola.length();
             for(int i=0; i<lunghezza; i++) {
                 newParola += parola.charAt(i)+",";
             }
            System.out.println(newParola);
        } while (!parola.equals(":q"));
    }
}
