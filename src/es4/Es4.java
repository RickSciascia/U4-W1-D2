package es4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero positivo per fare il countdown");
    int numero = Integer.parseInt(scanner.nextLine());
    for(int i = numero; i >= 0 ; i--) {
        System.out.println(i);
    }
    }
}
