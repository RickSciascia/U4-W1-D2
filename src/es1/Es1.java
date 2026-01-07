package es1;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Es1 es1 = new Es1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una parola");
        String parola = scanner.nextLine();
        System.out.println(es1.stringaPari(parola));
        int anno = Integer.parseInt(scanner.nextLine());
        System.out.println(es1.annoBisestile(anno));

    }

    public boolean stringaPari(String parola) {
        if(parola.length() % 2 == 0) return true;
        else return false;
    }
    public boolean annoBisestile(int anno) {
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
