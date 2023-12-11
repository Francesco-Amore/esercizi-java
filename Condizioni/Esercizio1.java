package Condizioni;

import java.awt.print.Printable;
import java.security.Principal;

public class Esercizio1 {
    public static void main(String[] args) {
        // Scrivi un programma Java che verifica se un numero intero è positivo, negativo o zero.
        int numero = 0;
        if (numero > 0) {
            System.out.println("numero è positivo");
        } else if (numero < 0)
            System.out.println("numero è negativo");
        else {
            System.out.println("numero è zero");
        }
    }
}