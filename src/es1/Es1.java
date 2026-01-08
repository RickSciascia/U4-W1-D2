package es1;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una parola");
        String parola = scanner.nextLine();
        System.out.println(stringaPari(parola));
        System.out.println("inserisci un anno per capire se è bisestile");
        int anno = Integer.parseInt(scanner.nextLine());
        System.out.println(annoBisestile(anno));

    }

    public static boolean stringaPari(String parola) {
        if(parola.length() % 2 == 0) return true;
        else return false;
    }
    public static boolean annoBisestile(int anno) {
        if(anno % 4 == 0) {
            if(anno % 100 == 0 ) {
                if(anno % 400 == 0) {
                    return true;
                } else return false;
            }
       return true;
        } else return false;
    }
}
