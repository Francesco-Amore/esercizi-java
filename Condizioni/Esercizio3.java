package Condizioni;

import java.awt.print.Printable;
import java.security.Principal;

public class Esercizio3 {
    public static void main(String[] args) {
        //Scrivi un programma Java che verifica se un carattere è una lettera maiuscola o una lettera minuscola.
        char verifica = 'A';
        if (Character.isUpperCase(verifica)) {
            System.out.println(verifica + " è una lettera MAIUSCOLA!");
        }
        else if (Character.isLowerCase(verifica)) {
            System.out.println(verifica + " è una lettera minuscola!");
        }

    }
}