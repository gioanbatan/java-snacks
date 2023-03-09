package snacks;

import java.util.Scanner;

public class SnackOne {
    public static void main(String[] args) {
        /*
        Snack 1 Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
         */

        int userNumber;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        userNumber = Integer.parseInt(scan.nextLine());

        if (userNumber%2 == 0) {
            System.out.println(userNumber);
        } else {
            System.out.println(userNumber + 1);
        }

        scan.close();
    }
}