package Condizioni;

import java.awt.print.Printable;
import java.security.Principal;

public class Esercizio4 {
    public static void main(String[] args) {
        //Scrivi un programma Java che verifica se un anno è bisestile.
        int anno = 1996;
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
            System.out.println("anno bisestile");
        }
    }
}
